package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class CreerCollaborateursController extends HttpServlet{
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	
	private static double STATIC_ID=0;
	public static String SOCIETY_NAME="GreatCorp";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// utilisation du service
		List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();
		req.getRequestDispatcher("/WEB-INF/views/collab/creerCollab.jsp").forward(req, resp);
	}
	
	
		
		@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
				throws ServletException, IOException {
			// Checking values
			//if(req.getParameter(BirthDate))
			/*
			// In Method HTML parameters exploitation 
			Enumeration paramNames = req.getParameterNames();
			resp.getWriter().write("Method Parameters \n");
            while(paramNames.hasMoreElements()) {
               String paramName = (String)paramNames.nextElement();
               resp.getWriter().write(paramName + " : " + req.getParameter(paramName) + "\n");

            }
           */
            
			/*Checking ssNumber has 15 digits*/
			
			if(req.getParameter("ssNumber") != null) {
			int count=0;
			Long ssNumber=Long.parseLong(req.getParameter("ssNumber"));
			while(ssNumber > 0) {
				ssNumber = ssNumber / 10;
				count = count + 1; 			
			
           if (count != 15 ) {
        	   resp.setStatus(400);
               resp.getWriter().print("Les parametres sont incorrects: "+"Numéro de SS");
           }else {
        	   
        	  
	           STATIC_ID++;
	           
	           DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	       	   String date = req.getParameter("BirthDate");
	       	
	       	   //convert String to LocalDate
	       	   LocalDate birthDate= LocalDate.parse(date, formatter);

	           StringBuilder email = new StringBuilder();
	           email.append(req.getParameter("FirstName"));
	           email.append(".");
	           email.append(req.getParameter("Name"));
	           email.append("@");
	           email.append(SOCIETY_NAME);
	           email.append(".com");
            
	           Collaborateur collab = new Collaborateur(
        		   STATIC_ID,
        		   req.getParameter("Name"), 
        		   req.getParameter("FirstName"), 
        		   birthDate,
        		   req.getParameter("Address"),
        		   ssNumber,
        		   email.toString(),
        		   "/resources/img_avatar.png", //default photo
        		   LocalDateTime.now(),
        		   true); // active
	           Constantes.COLLAB_SERVICE.sauvegarderCollaborateur(collab);
	           req.getRequestDispatcher("/WEB-INF/views/collab/viewCollab.jsp").forward(req, resp);
           }
			}
		}
}
}
