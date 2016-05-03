<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvenue</title>
</head>
<body>

<%= "Bienvenue "+(String) request.getSession().getAttribute("login") %>

<form method="get" action="logout"> <!-- On envoie ce formulaire à logout -->		
		
		<input value="Log out" type="submit"/>
</form>

</body>
</html>