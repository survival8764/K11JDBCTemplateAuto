<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<h2>스프링 MVC 시작하기</h2>

<h3>Spring 답변형 비회원제 게시판 제작</h3>
<li>
	<a href="board/list.do" target="_blank">
		SPRING JDBC(JdbcTemplate)을 이용한 게시판
	</a>
</li>
</body>
</html>
