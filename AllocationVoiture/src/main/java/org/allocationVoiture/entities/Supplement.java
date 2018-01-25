package org.allocationVoiture.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Supplement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private long codeSupplement;
	@Column()
	private String commentaire;
	@Column()
	private double tarif_jour;

	
	@OneToMany(mappedBy="supplement")
	private Collection<Prevoir> prevoires;
	
	public Supplement() {

	}

	
	public Supplement(String commentaire, double tarif_jour) {
		super();
		this.commentaire = commentaire;
		this.tarif_jour = tarif_jour;
	}


	public long getCodeSupplement() {
		return this.codeSupplement;
	}

	public void setCodeSupplement(long codeSupplement) {
		this.codeSupplement = codeSupplement;
	}

	public String getCommentaire() {
		return this.commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public double getTarif_jour() {
		return this.tarif_jour;
	}

	public void setTarif_jour(double tarif_jour) {
		this.tarif_jour = tarif_jour;
	}

}
