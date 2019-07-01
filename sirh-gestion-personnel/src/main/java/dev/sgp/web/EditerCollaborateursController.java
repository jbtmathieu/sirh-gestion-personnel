package dev.sgp.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateursController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//resp.getWriter().write("Hello EditerCollaborateursController!!");
		
		String avecMatricule =req.getParameter("matricule");
		//récupère la valeur d'un paramètre dont le nom est département

		//resp.getWriter().write("matricule="+ avecMatricule);
		if (avecMatricule == null) {
			resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}else {
			resp.getWriter().write("Matricule : "+avecMatricule);
			resp.setStatus(HttpServletResponse.SC_OK);
			
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse rep) 
			throws ServletException, IOException {
		/*String avecMatricule =req.getParameter("matricule");
		String avecTitre =req.getParameter("titre");
		String avecNom =req.getParameter("nom");
		String avecPrenom =req.getParameter("prenom");
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		Map<String, Boolean> liste = new HashMap<String, Boolean>();
		
		if (avecMatricule == null) {
			liste.put("matricule",false);
		}
		if (avecTitre == null) {
			liste.put("titre",false);
		}
		if (avecNom == null) {
			liste.put("nom",false);
		}
		if (avecPrenom == null) {
			liste.put("prenom",false);
		}
		Set set = liste.entrySet();
		Iterator it = set.iterator();
		int index=0;
		while(it.hasNext()) {
	         Map.Entry mentry = (Map.Entry)it.next();
	         if (mentry.getKey() == false) {
	        	 i++;
	        	 resp.getWriter().write(mentry.getKey());
	         }else {
	        	 
	      }
			
			
			
			
			resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			resp.getWriter().write("Matricule manquant");

			resp.getWriter().write("Matricule : "+avecMatricule);
			resp.setStatus(HttpServletResponse.SC_OK);
			
		}
		// create HTML response */
		String matricule = req.getParameter("matricule");
        String titre = req.getParameter("titre");
        String nom = req.getParameter("nom");
        String prenom = req.getParameter("prenom");

        if(matricule == null || "".equals(matricule)
                || titre == null || "".equals(titre)
                || nom == null || "".equals(nom)
                || prenom == null || "".equals(prenom)) {
            rep.setStatus(400);
            rep.getWriter().print("Les parametres sont incorrects");
        } else {
            rep.setStatus(201);
            rep.getWriter().print("Creation de collaborateur avec les parametres suivants\n"
                    + "matricule=" + matricule
                    + ",titre=" + titre
                    + ",nom=" + nom
                    + ",prenom=" + prenom
            );
		
	}
	}

}
