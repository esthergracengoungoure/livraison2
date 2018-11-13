package com.objis.cameroun.placementemployes.presentation;

import java.util.Scanner;

import com.objis.cameroun.placementemployes.domaine.Candidature;
import com.objis.cameroun.placementemployes.domaine.Employeur;
import com.objis.cameroun.placementemployes.service.impl.PlacementService;

/**
 * Classe qui permet aux chercheurs d'emploi d'une part et aux recruteurs d'autre part d'exprimer leurs besoins 
 * @author Ngoungoure Esther
 *
 */
public class PlacementEmployes {
 
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenue dans mon application de placement des employés qualifiés.  \n"
				+ "Pour soumettre votre candidature, tapez 1 \n"
				+ "Pour soumettre votre offre de recrutement, tapez 2.");
	
		
		char choix = sc.nextLine().charAt(0);
		
		switch (choix)
		{
			  case '1':
			  {
				Candidature candidat = new Candidature();
				
				 System.out.println("Donnez votre nom");
				candidat.setNomCandidat(sc.nextLine());
				 
				 System.out.println("Donnez votre prénom");
				 candidat.setPrenomCandidat(sc.nextLine());
				 
				 System.out.println("Donnez votre métier");
				 candidat.setMetierCandidat(sc.nextLine());
			     
				 System.out.println("Donnez votre numéro de téléphone");
				 candidat.setTelephoneCandidat(sc.nextLine());	
				 
				 System.out.println("Donnez votre adresse mail");
				 candidat.setEmailCandidat(sc.nextLine());
						 
				 System.out.println("Donnez votre nombre d'années d'expérience professionnelle");
				 candidat.setExperienceCandidat(sc.nextLine());
				 
				 System.out.println("Donnez votre âge");
				 candidat.setAgeCandidat(sc.nextLine());
				 
				 //instanciation de la classe PlacementService
				 PlacementService candidatX = new PlacementService();
				 candidatX.affichageCandidats(candidat);
				 
				 
				 System.out.println("Votre demande a bien été prise en compte, \n"
					  		+ "nous vous tiendrons informés de l'évolution des recherches");
				 
						
				break;
			  }
			 
			 
			  case '2':
			  {
				  Employeur employeur = new Employeur();
				  
				 System.out.println("Donnez le nom de votre entreprise, \n"
						+ "ou votre nom si vous recherchez un(e) employé(e) de maison." );
					employeur.setNomEntreprise(sc.nextLine());
					 
				 System.out.println("Donnez l'intitulé du poste vacant");
				    employeur.setPosteVacant(sc.nextLine());	 
					 
				 System.out.println("Donnez le salaire que vous proposez");
				    employeur.setSalairePropose(sc.nextLine());
				     
				 System.out.println("Donnez votre numéro de téléphone");
				    employeur.setTelephoneEmployeur(sc.nextLine());
				  
				 System.out.println("Donnez votre adress mail");
				    employeur.setEmailEmployeur(sc.nextLine()); 
					
			     System.out.println("Donnez la localisation de votre entreprise ou maison");
			        employeur.setLocalisation(sc.nextLine()); 
			        
				 System.out.println("Donnez la date limite de dépôt de candidature");
				    employeur.setDateLimite(sc.nextLine());
				    
				  //instanciation de la classe PlacementService   
				   PlacementService employeurX = new PlacementService();
					 employeurX.affichageOffres(employeur);
					 
				 System.out.println("Votre offre a bien été enregistrée, \n"
					  		+ "nous vous tiendrons informés de l'évolution des recherches.");
					  
					break;
			  }
			 default: System.out.println("CE CHOIX N'EXIXTE PAS. VEUILLEZ TAPER 1 OU 2");
		}
		}

}

