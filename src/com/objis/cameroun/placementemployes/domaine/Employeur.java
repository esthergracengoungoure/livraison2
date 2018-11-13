package com.objis.cameroun.placementemployes.domaine;

/**Classe qui contient les informations relatives à un employeur et permet d'y acceder
 * @author Ngoungoure Esther
 *
 */
public class Employeur {
	
	//Déclaration des variables
	private String nomEntreprise;
	private String posteVacant;
	private String salairePropose;
	private String telephoneEmployeur;
	private String emailEmployeur;
	private String localisation;
	private String dateLimite;
	
	//Constructeurs
	public Employeur() {
		super();
	}

	//Constructeur qui prend en paramètres toutes les propriétés de la classe Employeur
	/**
	 * @param nomEntreprise
	 * @param posteVacant
	 * @param telephoneEmployeur
	 * @param emailEmployeur
	 * @param localisation
	 * @param dateLimite
	 */
	public Employeur(String nomEntreprise, String posteVacant, String telephoneEmployeur,
			String emailEmployeur, String localisation, String dateLimite) {
		super();
		
		this.nomEntreprise = nomEntreprise;
		this.posteVacant = posteVacant;
		this.salairePropose = salairePropose;
		this.telephoneEmployeur = telephoneEmployeur;
		this.emailEmployeur = emailEmployeur;
		this.localisation = localisation;
		this.dateLimite = dateLimite;
	}

	// Accesseurs :getters et setters
	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	public String getPosteVacant() {
		return posteVacant;
	}

	public void setPosteVacant(String posteVacant) {
		this.posteVacant = posteVacant;
	}

	public String getSalairePropose() {
		return salairePropose;
	}

	public void setSalairePropose(String salairePropose) {
		this.salairePropose = salairePropose;
	}
	public String getTelephoneEmployeur() {
		return telephoneEmployeur;
	}

	public void setTelephoneEmployeur(String telephoneEmployeur) {
		this.telephoneEmployeur = telephoneEmployeur;
	}

	public String getEmailEmployeur() {
		return emailEmployeur;
	}

	public void setEmailEmployeur(String emailEmployeur) {
		this.emailEmployeur = emailEmployeur;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public String getDateLimite() {
		return dateLimite;
	}

	public void setDateLimite(String dateLimite) {
		this.dateLimite = dateLimite;
	}
		
}


