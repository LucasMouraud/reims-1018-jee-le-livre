<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Première page</title>
</head>
<body>
<p>
<%= request.getAttribute("text") %>
</p>
<form action="" method="post">
<% for (String value : (ArrayList<String>) request.getAttribute("choices")){ %>
	<div>
		<input type="radio" id="Choice1"
     name="choice" value="<%= value %>">
    <label for="Choice1"> <%= value %></label>
	</div>
<%}%>
  
  <div>
    <button type="submit">Envoyer</button>
  </div>
</form>

</body>
</html>