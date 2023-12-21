package com.mire.view.board;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.mire.biz.board.BoardService;
import com.mire.biz.board.BoardVO;
import com.mire.biz.board.impl.BoardDAO;

@Controller
public class BoardController{
	@Autowired
	private BoardService boardService;
	
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap(){
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("내용", "CONTENT");
		conditionMap.put("제목", "TITLE");
		return conditionMap;
	}

	@RequestMapping(value = "/deleteBoard.do")
	public String deleteBoard(BoardVO vo ) {
		boardService.deleteBoard(vo); 
		return "redirect:getBoardList.do";
	}
	@RequestMapping(value = "/getBoard.do")
	public String getBoard(BoardVO vo, Model model) {
		System.out.println("getBoard"); 
		BoardVO board = boardService.getBoard(vo);
		model.addAttribute("board", board);
		return "getBoard";
		
	}
	@RequestMapping(value = "/getBoardList.do")
	public String getBoardList(BoardVO vo, Model model) {
		System.out.println("getBoardList");
		//검색정보 Null Check
		if(vo.getSearchCondition() == null) vo.setSearchCondition("TITLE");
		if(vo.getSearchKeyword() == null) vo.setSearchKeyword("");
		
		
		
	    // 1. DB 연동 처리
	    List<BoardVO> boardList = boardService.getBoardList(vo);
	    //mav.addObject -> request 추가하는 역할을 진행한다. : forward 전송한다.
		model.addAttribute("boardList", boardList);
		return "getBoardList";
	}
	@RequestMapping(value = "/insertBoard.do")
	public String insertBoard(BoardVO vo) throws IllegalStateException, IOException {
		System.out.println("insertBoard");
		MultipartFile uploadFile = vo.getUploadFile();
		//업로드된 파일이 있다면 서버저장장치에 저장한다.
		if(!uploadFile.isEmpty()) {
			String fileName = uploadFile.getOriginalFilename();
			File file = new File("C:/DEV/fileSave/"+fileName);
			uploadFile.transferTo(file);
		}
		
		
		boardService.insertBoard(vo);
		return "redirect:getBoardList.do";
	}
	@RequestMapping(value = "/updateBoard.do")
	public String updateBoard(BoardVO vo) {
		System.out.println("updateBoard"); 
		System.out.println(vo.toString());
		boardService.updateBoard(vo); 
		return "redirect:getBoardList.do";
	}

}
