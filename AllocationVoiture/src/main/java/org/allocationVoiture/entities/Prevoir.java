package org.allocationVoiture.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Prevoir implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private long idPrevoir;
	
	@ManyToOne
	@JoinColumn(name="codeSupplement")
	private Supplement supplement;
	
	@ManyToOne
	@JoinColumn(name="NoContrat")
	private Contrat contrat;

	public Prevoir(Supplement supplement, Contrat contrat) {
		super();
		this.supplement = supplement;
		this.contrat = contrat;
	}

	public long getIdPrevoir() {
		return idPrevoir;
	}

	public void setIdPrevoir(long idPrevoir) {
		this.idPrevoir = idPrevoir;
	}

	public Supplement getSupplement() {
		return supplement;
	}

	public void setSupplement(Supplement supplement) {
		this.supplement = supplement;
	}

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	
	
}
