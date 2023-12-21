package com.mire.view.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mire.biz.board.BoardVO;
import com.mire.biz.board.impl.BoardDAO;
import com.mire.biz.user.UserVO;
import com.mire.biz.user.impl.UserDAO;

public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HandlerMapping handlerMapping;
	private ViewResolver viewResolver;
       
    public DispatcherServlet() {
        super();
    }
    
    

	@Override
	public void init() throws ServletException {
		//1. controller 객체를 만든다.
		handlerMapping = new HandlerMapping();
		//2. viewResolver 객체를 만들고, 경로를 배정한다.
		viewResolver = new ViewResolver();
		viewResolver.setPrefix("./");
		viewResolver.setSuffix(".jsp");
	}



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request,response);
	}
	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//1. 클라이언트 요청을 정보를 추출한다.
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));

		//2.해당된 controller 진행한다.
		Controller controller = handlerMapping.getController(path);
		
		//3.검색된 controller 실행해서 문자열을 리턴받는다.
		String viewName = controller.handleRequest(request, response);
		
		//4. 화면전환을 한다.
		if(!viewName.contains(".do")) {
			viewName = viewResolver.getView(viewName);
		}
		
		response.sendRedirect(viewName);
	}

}
