package com.sarra.vols.entities;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Avion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAv;
	private String nomAv;
	private Long capaciteAv;
	private String compagnieAv;
	
	@JsonIgnore
	@OneToMany(mappedBy = "avion")
	private List<Vol> vols;

	


}
