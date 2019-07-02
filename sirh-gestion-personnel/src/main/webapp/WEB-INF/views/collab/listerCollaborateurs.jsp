<%@page import="dev.sgp.service.CollaborateurService"%>
<%@page import="dev.sgp.entite.*"%>
<%@page import="dev.sgp.util.*"%>
<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.3.1-dist/css/bootstrap.css">
	<title>SGP - App</title>
	</head>
	<body>
	<h1>Les collaborateurs</h1>
		<ol>
	
			<%--
			
			Collaborateur collab = null;
			//creating arraylist object of type category class
			List<Collaborateur> listeCollab = new ArrayList<Collaborateur>();
			//storing passed value from jsp
			listeCollab = request.getAttribute("listeCollab");

			for(int i = 0; i < listeCollab.size(); i++) {

			collab = listeCollab.get(i);

			
			%>
			<li><%=collab.getNom() %></li>
			<li><%=collab.getPrenom() %></li>
			<li><%=collab.getDateDeNaissance() %></li>
			<li><%=collab.getAdresse() %></li>
			<li><%=collab.getEmailPro() %></li>
			<li><%=collab.getMatricule() %></li>
			<li><%=collab.getDateHeureCreation() %></li>
			<li><%=collab.getNumeroSecuriteSociale() %></li>
			<li><%=collab.getPhotoLoc() %></li>
			<%
			}
			--%>
			<% 
			List<Collaborateur> collaborateurs = Constantes.COLLAB_SERVICE.listerCollaborateurs();
		for(int i = 0; i < collaborateurs.size(); i++) {   
			 %> 
			<%-- >out.print("<li>"+collaborateurs.get(i)+"</li>"); --%>
			<%
			Collaborateur collab = collaborateurs.get(i);
			%>
			<li><ul><li><%=collab.getNom() %></li>
			<li><%=collab.getPrenom() %></li>
			<li><%=collab.getDateDeNaissance() %></li>
			<li><%=collab.getAdresse() %></li>
			<li><%=collab.getEmailPro() %></li>
			<li><%=collab.getMatricule() %></li>
			<li><%=collab.getDateHeureCreation() %></li>
			<li><%=collab.getNumeroSecuriteSociale() %></li>
			<li><%=collab.getPhotoLoc() %></li></ul></li>
			<%
		} %>
		<%--
		out.print("<li> Attribut ciblé:"+collaborateurs.get(0).getNom()+"</li>");
		--%>
				</ol>
		
		
		<a href="http://localhost:8080/sgp/collaborateurs/creer">CREER</a>
	

	</body>
</html>