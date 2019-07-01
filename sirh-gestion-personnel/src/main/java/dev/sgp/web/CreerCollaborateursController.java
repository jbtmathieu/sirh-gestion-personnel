package dev.sgp.web;

import java.io.IOException;
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
	
	private static double ID=0;

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
			
			
			
			/* In Method HTML parameters exploitation */
			Enumeration paramNames = req.getParameterNames();
			resp.getWriter().write("Method Parameters \n");
            while(paramNames.hasMoreElements()) {
               String paramName = (String)paramNames.nextElement();
               resp.getWriter().write(paramName + " : " + req.getParameter(paramName) + "\n");

            }
           // OR (jsp>)
           req.getRequestDispatcher("/WEB-INF/views/collab/viewCollab.jsp").forward(req, resp);
	}
	
}
