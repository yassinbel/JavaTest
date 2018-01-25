package org.allocationVoiture.dao;

import java.util.List;

import org.allocationVoiture.entities.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IClientDao extends JpaRepository<Client, Long> {
	public List<Client> findByNom(String nom);

	public Page<Client> findByNom(String nom, Pageable pageable);

	@Query("select e from Client e where e.nom like %:x% or e.cin like %:x% order by nom asc") 
	public Page<Client> chercherClients(@Param("x") String nom, Pageable pageable);

}
