package dev.sgp.web;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class ListerCollaborateursController extends HttpServlet {

	/*
	protected void doGet2(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().write("Hello ListerCollaborateursController!!");
		// récupère la valeur d'un paramètre dont le nom est avecPhoto
		String avecPhotoParam = req.getParameter("avecPhoto");
		// récupère la valeur d'un paramètre dont le nom est département
		String departementParam = req.getParameter("departement");
		resp.setContentType("text/html");

		// code HTML ecrit dans le corps de la réponse
		resp.getWriter().write("<h1>Liste des collaborateurs</h1>" + "<ul>" + "<li>avecPhoto=" + avecPhotoParam
				+ "</li>" + "<li>avecDepartement=" + departementParam + "</li>" + "<ul>");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// A ajouter
		req.setAttribute("listeNoms", Arrays.asList("Robert", "Jean", "Hugues"));
		req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, resp);
	}
	*/

		// Service Technique Collaborateur

		// recuperation du service
		private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
		ServletException, IOException {
		// utilisation du service
		List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();
		req.setAttribute("listeNoms", Arrays.asList("Robert", "Jean", "Hugues"));
		req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, resp);
		}
		
	
}
