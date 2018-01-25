package org.allocationVoiture.dao;

import java.util.Date;
import java.util.List;


import org.allocationVoiture.entities.Voiture;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
;

public interface IVehiculeDao extends JpaRepository<Voiture,String>{

	public Page<Voiture> findByDisponible(boolean disponible, Pageable pageable);



}
