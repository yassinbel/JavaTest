package org.allocationVoiture.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Contrat implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private long NoContrat;
	@Column()
	private Date date_Contrat;
	@Column()
	private Date date_Enlevement;
	@Column()
	private Date date_Retour;
	
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name="nimmatriculation")
	private Voiture voiture;

	
	@OneToMany(mappedBy="contrat")
	private Collection<Prevoir> prevoire;
	public Contrat() {

	}

	

	public Contrat(Date date_Contrat, Date date_Enlevement, Date date_Retour, Client client, Voiture voiture) {
		super();
		this.date_Contrat = date_Contrat;
		this.date_Enlevement = date_Enlevement;
		this.date_Retour = date_Retour;
		this.client = client;
		this.voiture = voiture;
	}



	public long getNoContrat() {
		return this.NoContrat;
	}

	public void setNoContrat(long noContrat) {
		NoContrat = noContrat;
	}

	public Date getDate_Contrat() {
		return this.date_Contrat;
	}

	public void setDate_Contrat(Date date_Contrat) {
		this.date_Contrat = date_Contrat;
	}

	public Date getDate_Enlevement() {
		return this.date_Enlevement;
	}

	public void setDate_Enlevement(Date date_Enlevement) {
		this.date_Enlevement = date_Enlevement;
	}

	public Date getDate_Retour() {
		return this.date_Retour;
	}

	public void setDate_Retour(Date date_Retour) {
		this.date_Retour = date_Retour;
	}

}
