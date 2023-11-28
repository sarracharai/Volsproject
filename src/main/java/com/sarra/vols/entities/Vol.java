package com.sarra.vols.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Vol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idV;
	private String destinationV;
	private String aeroportDepartV;
	private String aeroportArriveeV;
	private String statutV;
	
	
	
	public Vol() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@ManyToOne
	private Avion avion;


	public Vol(String destinationV, String aeroportDepartV, String aeroportArriveeV, String statutV) {
		super();
		this.destinationV = destinationV;
		this.aeroportDepartV = aeroportDepartV;
		this.aeroportArriveeV = aeroportArriveeV;
		this.statutV = statutV;
	}



	public Long getIdV() {
		return idV;
	}



	public void setIdV(Long idV) {
		this.idV = idV;
	}



	public String getDestinationV() {
		return destinationV;
	}



	public void setDestinationV(String destinationV) {
		this.destinationV = destinationV;
	}



	public String getAeroportDepartV() {
		return aeroportDepartV;
	}



	public void setAeroportDepartV(String aeroportDepartV) {
		this.aeroportDepartV = aeroportDepartV;
	}



	public String getAeroportArriveeV() {
		return aeroportArriveeV;
	}



	public void setAeroportArriveeV(String aeroportArriveeV) {
		this.aeroportArriveeV = aeroportArriveeV;
	}



	public String getStatutV() {
		return statutV;
	}



	public void setStatutV(String statutV) {
		this.statutV = statutV;
	}


	public Avion getAvion() {
		return avion;
	}



	public void setAvion(Avion avion) {
		this.avion = avion;
	}



	@Override
	public String toString() {
		return "Vol [idV=" + idV + ", destinationV=" + destinationV + ", aeroportDepartV=" + aeroportDepartV
				+ ", aeroportArriveeV=" + aeroportArriveeV + ", statutV=" + statutV + "]";
	}
	
	
	
	

}
