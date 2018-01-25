package org.allocationVoiture.dao;

import org.allocationVoiture.entities.Type_Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITypeVoitureDao extends JpaRepository<Type_Voiture,Long>{

}
