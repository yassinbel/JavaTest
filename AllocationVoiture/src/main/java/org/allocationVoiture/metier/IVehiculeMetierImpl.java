package org.allocationVoiture.metier;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class IVehiculeMetierImpl implements  IVehiculeMetier{

	@Override
	public void louer(long idClient, long NoContrat, Date date_Enlevement, Date date_Retour) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retourner() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void is_louer() {
		// TODO Auto-generated method stub
		
	}

	
}
