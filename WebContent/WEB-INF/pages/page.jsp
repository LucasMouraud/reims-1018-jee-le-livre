<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.jeelelivre.pages.Page"%>
<%@ page import="com.jeelelivre.pages.Choice"%>
<%
	Page thisPage = (Page) request.getAttribute("page");
%>
<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title><%=thisPage.getTitle()%></title>
<link href="https://fonts.googleapis.com/css?family=Roboto|Roboto+Slab" rel="stylesheet">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="style.css"/>

</head>
<body class="container">
<header>

	<h1>Votre aventure à Poudlard.</h1>
	<h2>Le livre dont vous êtes le sorcier/la sorcière.</h2>
	
</header>

	<nav>
			<a href="<%=request.getContextPath()%>/" class="link"><img src="https://raw.githubusercontent.com/WildCodeSchool/reims-1018-jee-le-livre/gh-pages/images/logo_castle.png" width="50" height="50" alt="Retour à l'accueil"></a>
			<a href="<%=request.getContextPath()%>/" class= "link">Retour à l'accueil</a>
	</nav>
	
	<h1><%=thisPage.getTitle()%></h1>
	<hr>
	<p><%=thisPage.getContent()%></p>

	<%
		for (Choice choice : (List<Choice>) thisPage.getChoices()) {
	%>
	<a href="<%=request.getContextPath()%>/pages?id=<%=choice.getNextPage()%>" class="btn btn-outline-dark choices"><%=choice.getChoice()%></a>
	<%
		}
	%>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>
