package com.sarra.vols.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


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
	
	 /*@OneToOne
	private Image image;
*/
	
	
	
	@OneToMany (mappedBy = "vol")
	private List<Image> images;
	


	public Vol(Long idV, String destinationV, String aeroportDepartV, String aeroportArriveeV, String statutV,
			Avion avion,List<Image> images ) {
		super();
		this.idV = idV;
		this.destinationV = destinationV;
		this.aeroportDepartV = aeroportDepartV;
		this.aeroportArriveeV = aeroportArriveeV;
		this.statutV = statutV;
		this.avion = avion;
		this.images = images;
		//this.image = image;
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


/*
	public Image getImage() {
		return image;
	}



	public void setImage(Image image) {
		this.image = image;
	}
	
	*/



	@Override
	public String toString() {
		return "Vol [idV=" + idV + ", destinationV=" + destinationV + ", aeroportDepartV=" + aeroportDepartV
				+ ", aeroportArriveeV=" + aeroportArriveeV + ", statutV=" + statutV + "]";
	}



	public List<Image> getImages() {
		return images;
	}



	public void setImages(List<Image> images) {
		this.images = images;
	}
	
	
	
	

}
