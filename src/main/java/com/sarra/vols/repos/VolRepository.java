package com.sarra.vols.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sarra.vols.entities.Avion;
import com.sarra.vols.entities.Vol;

@RepositoryRestResource(path = "rest")
public interface VolRepository extends JpaRepository<Vol,Long> {
	List<Vol> findBydestinationV(String destination);
	List<Vol> findBydestinationVContains(String destination);
	
	@Query("select v from Vol v where v.avion = ?1") 
	List<Vol> findByAvion (Avion avion);
	
	List<Vol> findByAvionIdAv(Long id);
	List<Vol> findByOrderByDestinationVAsc();
	
	
}
