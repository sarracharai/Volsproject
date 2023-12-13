package com.sarra.vols.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sarra.vols.entities.Avion;

@RepositoryRestResource(path = "av") 
@CrossOrigin(origins ="http://localhost:4200/") //pour autoriser angular
public interface AvionRepository extends JpaRepository<Avion,Long>{

}
