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
		
		System.out.println("Bienvenue dans mon application de placement des employ�s qualifi�s.  \n"
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
				 
				 System.out.println("Donnez votre pr�nom");
				 candidat.setPrenomCandidat(sc.nextLine());
				 
				 System.out.println("Donnez votre m�tier");
				 candidat.setMetierCandidat(sc.nextLine());
			     
				 System.out.println("Donnez votre num�ro de t�l�phone");
				 candidat.setTelephoneCandidat(sc.nextLine());	
				 
				 System.out.println("Donnez votre adresse mail");
				 candidat.setEmailCandidat(sc.nextLine());
						 
				 System.out.println("Donnez votre nombre d'ann�es d'exp�rience professionnelle");
				 candidat.setExperienceCandidat(sc.nextLine());
				 
				 System.out.println("Donnez votre �ge");
				 candidat.setAgeCandidat(sc.nextLine());
				 
				 //instanciation de la classe PlacementService
				 PlacementService candidatX = new PlacementService();
				 candidatX.affichageCandidats(candidat);
				 
				 
				 System.out.println("Votre demande a bien �t� prise en compte, \n"
					  		+ "nous vous tiendrons inform�s de l'�volution des recherches");
				 
						
				break;
			  }
			 
			 
			  case '2':
			  {
				  Employeur employeur = new Employeur();
				  
				 System.out.println("Donnez le nom de votre entreprise, \n"
						+ "ou votre nom si vous recherchez un(e) employ�(e) de maison." );
					employeur.setNomEntreprise(sc.nextLine());
					 
				 System.out.println("Donnez l'intitul� du poste vacant");
				    employeur.setPosteVacant(sc.nextLine());	 
					 
				 System.out.println("Donnez le salaire que vous proposez");
				    employeur.setSalairePropose(sc.nextLine());
				     
				 System.out.println("Donnez votre num�ro de t�l�phone");
				    employeur.setTelephoneEmployeur(sc.nextLine());
				  
				 System.out.println("Donnez votre adress mail");
				    employeur.setEmailEmployeur(sc.nextLine()); 
					
			     System.out.println("Donnez la localisation de votre entreprise ou maison");
			        employeur.setLocalisation(sc.nextLine()); 
			        
				 System.out.println("Donnez la date limite de d�p�t de candidature");
				    employeur.setDateLimite(sc.nextLine());
				    
				  //instanciation de la classe PlacementService   
				   PlacementService employeurX = new PlacementService();
					 employeurX.affichageOffres(employeur);
					 
				 System.out.println("Votre offre a bien �t� enregistr�e, \n"
					  		+ "nous vous tiendrons inform�s de l'�volution des recherches.");
					  
					break;
			  }
			 default: System.out.println("CE CHOIX N'EXIXTE PAS. VEUILLEZ TAPER 1 OU 2");
		}
		}

}

