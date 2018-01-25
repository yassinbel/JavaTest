package org.allocationVoiture.dao;

import java.util.Date;

import org.allocationVoiture.entities.Contrat;
import org.allocationVoiture.entities.Voiture;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IContratDao extends JpaRepository<Contrat, Long> {

	@Query("select e from Contrat e where e.date_Retour=:x ")
	public Page<Voiture> voituresNonRendus(@Param("x") Date date, Pageable pageable);
	

}
