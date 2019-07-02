package dev.sgp.entite;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Collaborateur {
	protected double matricule;
	protected String nom;
	protected String prenom;
	protected LocalDate dateDeNaissance;
	protected String Adresse;
	protected Long numeroSecuriteSociale;
	protected String emailPro;
	protected String photoLoc;
	protected LocalDateTime dateHeureCreation;
	protected boolean actif;
	public Collaborateur(double STATIC_ID, String nom, String prenom, LocalDate DDN, String adresse,
			Long numeroSecuriteSociale, String email, String photoLoc, LocalDateTime localDateTime,
			boolean actif) {
		super();
		this.matricule = STATIC_ID;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = DDN;
		Adresse = adresse;
		this.numeroSecuriteSociale = numeroSecuriteSociale;
		this.emailPro = email;
		this.photoLoc = photoLoc;
		this.dateHeureCreation = localDateTime;
		this.actif = actif;
	}

	
	
	public double getMatricule() {
		return matricule;
	}



	public void setMatricule(double matricule) {
		this.matricule = matricule;
	}



	public void setDateHeureCreation(LocalDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}



	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	
	
	public Long getNumeroSecuriteSociale() {
		return numeroSecuriteSociale;
	}



	public void setNumeroSecuriteSociale(Long numeroSecuriteSociale) {
		this.numeroSecuriteSociale = numeroSecuriteSociale;
	}



	public LocalDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}



	public String getEmailPro() {
		return emailPro;
	}
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}
	public String getPhotoLoc() {
		return photoLoc;
	}
	public void setPhotoLoc(String photoLoc) {
		this.photoLoc = photoLoc;
	}

	public boolean isActif() {
		return actif;
	}
	public void setActif(boolean actif) {
		this.actif = actif;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Collaborateur [matricule=");
		builder.append(matricule);
		builder.append(", nom=");
		builder.append(nom);
		builder.append(", prenom=");
		builder.append(prenom);
		builder.append(", dateDeNaissance=");
		builder.append(dateDeNaissance);
		builder.append(", Adresse=");
		builder.append(Adresse);
		builder.append(", numeroSecuriteSociale=");
		builder.append(numeroSecuriteSociale);
		builder.append(", emailPro=");
		builder.append(emailPro);
		builder.append(", photoLoc=");
		builder.append(photoLoc);
		builder.append(", dateHeureCreation=");
		builder.append(dateHeureCreation);
		builder.append(", actif=");
		builder.append(actif);
		builder.append("]");
		return builder.toString();
	}

	
	

}
