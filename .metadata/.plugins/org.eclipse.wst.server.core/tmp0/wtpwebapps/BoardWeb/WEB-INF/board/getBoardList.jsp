
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%
//List<BoardVO> boardList =(List)session.getAttribute("boardList");
    // 3. 응답 화면 구성
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>글 목록</title>
</head>
<body>
    <center>
        <h1>글 목록</h1>
        <h3>${userName}님 환영합니다! <a href="logout.do">Log-out</a></h3>
        <!-- 검색 시작 -->
        <form action="getBoardList.do" method="post">
            <table border="1" cellpadding="0" cellspacing="0" width="700">
                <tr>
                    <td align="right">
                        <!-- <select name="searchCondition">
                            <option value="TITLE">제목</option>
                            <option value="CONTENT">내용</option>
                        </select> -->
                        <select name="searchCondition">
                        		<c:forEach items="${conditionMap}" var="data">
                        		<option value="${data.value}">${data.key}</option>
                        		</c:forEach>
                        </select>
                        <input name="searchKeyword" type="text"/>
                        <input type="submit" value="검색"/>
                    </td>
                </tr>
            </table>
        </form>
        <!-- 검색 종료 -->
        <table border="1" cellpadding="0" cellspacing="0" width="700">
            <tr>
                <th width="100" bgcolor="orange">번호</th>
                <th width="200" bgcolor="orange">제목</th>
                <th width="150" bgcolor="orange">작성자</th>
                <th width="150" bgcolor="orange">등록일</th>
                <th width="100" bgcolor="orange">조회수</th>
            </tr>
            <c:forEach items="${boardList }" var="board">
            <tr>
                <td>${board.seq }</td>
                <td align="left"><a href="getBoard.do?seq=${board.seq }">${board.title }</a></td>
                <td>${board.writer }</td>
                <td>${board.regDate }</td>
                <td>${board.cnt }</td>
            </tr>
						</c:forEach>
        </table>
        <br>
        <a href="insertBoard.jsp">새글 등록</a>
    </center>
</body>
</html>
