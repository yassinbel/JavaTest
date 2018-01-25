package org.allocationVoiture.dao;

import org.allocationVoiture.entities.Reparation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IReparationDao extends JpaRepository<Reparation,Long> {

}
