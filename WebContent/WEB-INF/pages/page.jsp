<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jeelelivre.pages.Page" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Title</title>
</head>
<body>
	<h1><%= request.getAttribute("page1Title") %></h1>
	<p><%= request.getAttribute("page1Content") %></p>
</body>
</html>  