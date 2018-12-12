<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jeelelivre.pages.Page" %>
<%@ page import="com.jeelelivre.pages.Choice" %>
<%Page thisPage = (Page) request.getAttribute("page"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Title</title>
</head>
<body>
	<h1><%= thisPage.getTitle() %></h1>
	<p><%= thisPage.getContent() %></p>
	<p><%= thisPage.getChoices() %></p>
</body>
</html>  