/**
 * 
 */
package com.objis.cameroun.placementemployes.service;

import com.objis.cameroun.placementemployes.domaine.Candidature;
import com.objis.cameroun.placementemployes.domaine.Employeur;

/** Interface contenant uniquement les d�clarations des m�thodes qui seront utilis�es 
 * par la classe PlacementService
 * @author Ngoungoure Esther
 *
 */
public interface IPlacementService {
	
	public void affichageCandidats(Candidature candidat);
	
	public void affichageOffres(Employeur offre);
	
}
