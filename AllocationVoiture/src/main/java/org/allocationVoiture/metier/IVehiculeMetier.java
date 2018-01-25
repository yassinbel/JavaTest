package org.allocationVoiture.metier;

import java.util.Date;

public interface IVehiculeMetier {

	public void louer(long idClient,long NoContrat, Date date_Enlevement, Date date_Retour);
	public void retourner();
	public void is_louer();
}
