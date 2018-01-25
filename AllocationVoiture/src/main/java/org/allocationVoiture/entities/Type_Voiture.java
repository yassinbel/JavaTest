package org.allocationVoiture.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Type_Voiture implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue
	private long codeType;
	@Column()
	private String marque;
	@Column()
	private String model;
	@Column()
	private int nbrPlace;
	@Column()
	private double prix_jour;

	@OneToMany(mappedBy = "type")
	private Collection<Voiture> voitures;

	public Type_Voiture() {

	}

	public Type_Voiture(long codeType, String marque, String model, int nbrPlace, double prix_jour) {
		super();
		this.codeType = codeType;
		this.marque = marque;
		this.model = model;
		this.nbrPlace = nbrPlace;
		this.prix_jour = prix_jour;
	}

	public long getCodeType() {
		return this.codeType;
	}

	public void setCodeType(long codeType) {
		this.codeType = codeType;
	}

	public String getMarque() {
		return this.marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNbrPlace() {
		return this.nbrPlace;
	}

	public void setNbrPlace(int nbrPlace) {
		this.nbrPlace = nbrPlace;
	}

	public double getPrix_jour() {
		return this.prix_jour;
	}

	public void setPrix_jour(double prix_jour) {
		this.prix_jour = prix_jour;
	}

}
