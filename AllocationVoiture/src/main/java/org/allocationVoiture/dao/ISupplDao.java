package org.allocationVoiture.dao;

import org.allocationVoiture.entities.Supplement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISupplDao extends JpaRepository<Supplement,Long>{

}
