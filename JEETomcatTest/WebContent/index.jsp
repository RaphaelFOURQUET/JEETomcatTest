<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html">
<title>My jsp index</title>
</head>
<body>

	<!-- Balise % pour inserer du code Java -->
	<%-- <%
response.getWriter().append("Il est : "+new Date());
%> --%>

	<%-- Commentaires Java --%>
	<%-- <%= "\nTest balise append." %> --%>

	<%-- Transmission d'information comme ceci : 
request.setAttribute( "test", message );

Délégation à partir d'une servlet :
this.getServletContext()
.getRequestDispatcher( "/WEB-INF/test.jsp")
.forward( request, response );`

Dans la JSP : 
<% String attribut = (String) request.getAttribute("test"); out.println( attribut );%> 

Redirection : response.sendRedirect( "index.jsp" );
--%>

	<%
		String sessionLogin = (String) request.getSession().getAttribute("login");
		String login = request.getParameter("login");

		if (sessionLogin == null) {
			//redirection page de log.
			response.sendRedirect("loginForm.jsp");
		} else {
			//Redirection page Bienvenue ?
			//response.getWriter().append("Bienvenue !");
			response.sendRedirect("logoutForm.jsp");
		}
	%>




</body>
</html>