package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {
	protected String matricule;
	protected String nom;
	protected String prenom;
	protected LocalDate dateDeNaissance;
	protected String Adresse;
	protected String numeroSecuriteSociale;
	protected String emailPro;
	protected String photoLoc;
	protected ZonedDateTime dateHeureCreation;
	protected boolean actif;

}
