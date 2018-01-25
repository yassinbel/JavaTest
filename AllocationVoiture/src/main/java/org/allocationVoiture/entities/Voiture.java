package org.allocationVoiture.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Voiture implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String nimmatriculation;
	@Column()
	private boolean disponible;

	@OneToMany(mappedBy = "voiture")
	private Collection<Reparation> reparations;
	@OneToMany(mappedBy = "voiture")
	private Collection<Contrat> contrats;
	@ManyToOne
	@JoinColumn(name = "codeType")
	private Type_Voiture type;

	public Voiture() {

	}



	public Voiture(String nimmatriculation, boolean disponible, Type_Voiture type) {
		super();
		this.nimmatriculation = nimmatriculation;
		this.disponible = disponible;
		this.type = type;
	}



	public String getNimmatriculation() {
		return this.nimmatriculation;
	}

	public void setNimmatriculation(String nimmatriculation) {
		this.nimmatriculation = nimmatriculation;
	}

	public boolean isDisponible() {
		return this.disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}



	public Type_Voiture getType() {
		return this.type;
	}



	public void setType(Type_Voiture type) {
		this.type = type;
	}
	

}
