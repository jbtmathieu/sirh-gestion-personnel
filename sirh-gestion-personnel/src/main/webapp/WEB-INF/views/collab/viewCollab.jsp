

<%@ page import = "java.io.*,java.util.*" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
  <title>Creation window</title>
</head>
<body>
         <h2>view Collab</h2>
         
         
 
   <img alt="photo" src="img_avatar2.png"/>   

        <%  out.print("JSP Parameters"); %>
         <br>
        <table class="table">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Value</th>
    </tr>
  </thead>
         <tbody>    
            <%
            Enumeration paramNames = request.getParameterNames(); %>
            <%-- JSP Parameters exploitation--%>
            <% 
            
            while(paramNames.hasMoreElements()) {
               String paramName = (String)paramNames.nextElement();
               out.print("<tr><th scope=\"row\"><td>"+paramName 
            		   + "</th>\n : <td>" 
               		   + request.getParameter(paramName) + "</td></tr>\n");
               }
            %>

		</tbody>
		</table>
   <a href="http://localhost:8080/sgp/collaborateurs/creer">Retour création utilisateur</a>
   </body>
</html>
