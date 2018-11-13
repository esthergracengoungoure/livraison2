package com.objis.cameroun.placementemployes.service.impl;

import com.objis.cameroun.placementemployes.domaine.Candidature;
import com.objis.cameroun.placementemployes.domaine.Employeur;
import com.objis.cameroun.placementemployes.service.IPlacementService;

public class PlacementService implements IPlacementService {
	/**
	 * c'est une classe qui permet de retourner aux candidats et aux employeurs les informations données
	 * @param candidat
	 */
	
	public void affichageCandidats(Candidature candidat) {
		// cette méthode permet d'afficher les paramètres du candidat
		System.out.println("Votre profil candidat est : \n"
				+ "Nom "  + candidat.getNomCandidat() + "\n"
				+ "Prenom: " + candidat.getPrenomCandidat() +"\n"
				+ "Metier:" + candidat.getMetierCandidat() + "\n"
				+ "Telephone:" + candidat.getTelephoneCandidat() + "\n"
				+ "Email:" + candidat.getEmailCandidat() + "\n"
				+ "Expérience:" + candidat.getExperienceCandidat() + "\n"
				+ "Age:" + candidat.getAgeCandidat() + " \n"
						+ "\n");		
	}

	public void affichageOffres(Employeur offre) {
		// cette méthode permet d'afficher les caractéristiques d'une offre
		System.out.println("Votre offre est : \n"
				+ "NomEntreprise:" + offre.getNomEntreprise() + "\n"
				+ "PosteVacant:" + offre.getPosteVacant() + "\n"
				+ "SalairePropose:" + offre.getSalairePropose() + "\n"
				+ "TelephoneEmployeur:" + offre.getTelephoneEmployeur() + "\n"
				+ "EmailEmployeur:" + offre.getEmailEmployeur() +"\n"
				+ "Localisation:" + offre.getLocalisation() + "\n"
				+ "DateLimite:" + offre.getDateLimite() + "\n"
						+ "\n");		
}
}