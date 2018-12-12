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
<nav>
<a href="<%= request.getContextPath() %>/">Retour à l'accueil</a>
</nav>
	<h1><%= thisPage.getTitle() %></h1>
	<p><%= thisPage.getContent() %></p>

<% for(Choice choice : (List<Choice>) thisPage.getChoices()) { %>
	<a href="<%= request.getContextPath() %>/pages?id=<%= choice.getNextPage() %>"><%= choice.getChoice()%></a>
<%} %>
	
</body>
</html>  