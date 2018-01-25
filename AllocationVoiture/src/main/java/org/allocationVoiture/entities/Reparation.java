package org.allocationVoiture.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Reparation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private long num_rep;
	private Date date_Rep;
	private String description;
	private double montant;
	
	@ManyToOne
	@JoinColumn(name="nimmatriculation")
	private Voiture voiture;

	public Reparation(Date date_Rep, String description, double montant, Voiture voiture) {
		super();
		this.date_Rep = date_Rep;
		this.description = description;
		this.montant = montant;
		this.voiture = voiture;
	}

	public long getNum_rep() {
		return num_rep;
	}

	public void setNum_rep(long num_rep) {
		this.num_rep = num_rep;
	}

	public Date getDate_Rep() {
		return date_Rep;
	}

	public void setDate_Rep(Date date_Rep) {
		this.date_Rep = date_Rep;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
	
	
}
