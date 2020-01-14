package jpa;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Participant {
	
	@Id
	String email;
	String nom;
	String prenom;
	
	@OneToMany(mappedBy="p")
	List<Reponse> listReponse;
	
	@ManyToOne
	Administrateur adm;
	
	public Participant() {
		
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Reponse> getListReponse() {
		return listReponse;
	}

	public void setListReponse(List<Reponse> listReponse) {
		this.listReponse = listReponse;
	}
	
	
	
}
