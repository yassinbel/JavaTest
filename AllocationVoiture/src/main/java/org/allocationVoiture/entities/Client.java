package org.allocationVoiture.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long idClient;
	@Column()
	private String nom;
	@Column()
	private String prenom;
	@Column()
	private Date date_naissance;
	@Column()
	private String tel;
	@Column()
	private String adresse;
	@Column()
	private String ville;
	@Column()
	private String num_permis;
	@Column()
	private String cin;

	@OneToMany(mappedBy = "client")
	private Collection<Contrat> contrats;

	public Client() {
	}

	public Client(String nom, String prenom, Date date_naissance, String tel, String adresse, String ville,
			String num_permis, String cin) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance = date_naissance;
		this.tel = tel;
		this.adresse = adresse;
		this.ville = ville;
		this.num_permis = num_permis;
		this.cin = cin;
	}

	public long getIdClient() {
		return this.idClient;
	}

	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDate_naissance() {
		return this.date_naissance;
	}

	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getNum_permis() {
		return this.num_permis;
	}

	public void setNum_permis(String num_permis) {
		this.num_permis = num_permis;
	}

	public String getCin() {
		return this.cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

}
