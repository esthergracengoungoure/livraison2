package com.objis.cameroun.placementemployes.domaine;

/**
 * Classe qui contient les informations relatives à un candidat et permet d'y acceder 
 * @author Ngoungoure Esther
 *
 */
public class Candidature {
	
	// Variables
	private String nomCandidat;
	private String prenomCandidat;
	private String metierCandidat;
	private String telephoneCandidat;
	private String emailCandidat;
	private String experienceCandidat;
	private String ageCandidat;
	
	//Constructeurs
	
	public Candidature() {
		super();
	}
   //Constructeur qui prend en paramètres toutes les propriétés de la classe Candidature
	
	/**
	 * @param nomCandidat
	 * @param prenomCandidat
	 * @param metierCandidat
	 * @param telephoneCandidat
	 * @param emailCandidat
	 * @param experienceCandidat
	 * @param ageCandidat
	 */
	public Candidature(String nomCandidat, String prenomCandidat, String metierCandidat, String telephoneCandidat,
			String emailCandidat, String experienceCandidat, String ageCandidat) {
		super();
		
		this.nomCandidat = nomCandidat;
		this.prenomCandidat = prenomCandidat;
		this.metierCandidat = metierCandidat;
		this.telephoneCandidat = telephoneCandidat;
		this.emailCandidat = emailCandidat;
		this.experienceCandidat = experienceCandidat;
		this.ageCandidat = ageCandidat;
	}

	//Accesseurs: getters & setters
	
	public String getNomCandidat() {
		return nomCandidat;
	}

	public void setNomCandidat(String nomCandidat) {
		this.nomCandidat = nomCandidat;
	}

	public String getPrenomCandidat() {
		return prenomCandidat;
	}

	public void setPrenomCandidat(String prenomCandidat) {
		this.prenomCandidat = prenomCandidat;
	}

	public String getMetierCandidat() {
		return metierCandidat;
	}

	public void setMetierCandidat(String metierCandidat) {
		this.metierCandidat = metierCandidat;
	}

	public String getTelephoneCandidat() {
		return telephoneCandidat;
	}

	public void setTelephoneCandidat(String telephoneCandidat) {
		this.telephoneCandidat = telephoneCandidat;
	}

	public String getEmailCandidat() {
		return emailCandidat;
	}

	public void setEmailCandidat(String emailCandidat) {
		this.emailCandidat = emailCandidat;
	}

	public String getExperienceCandidat() {
		return experienceCandidat;
	}

	public void setExperienceCandidat(String experienceCandidat) {
		this.experienceCandidat = experienceCandidat;
	}

	public String getAgeCandidat() {
		return ageCandidat;
	}

	public void setAgeCandidat(String ageCandidat) {
		this.ageCandidat = ageCandidat;
	}
	
}
