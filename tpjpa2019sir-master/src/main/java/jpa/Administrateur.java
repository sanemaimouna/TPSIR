package jpa;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Administrateur {
	@Id
	String email;
	String nom;
	String prenom;
	
	@OneToMany(mappedBy="admin")
	List<Reunion> listReunion;
	
	@OneToMany(mappedBy="adm")
	List<Participant> listParticipant;
	
	public Administrateur() {
		
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

	public List<Reunion> getListReunion() {
		return listReunion;
	}

	public void setListReunion(List<Reunion> listReunion) {
		this.listReunion = listReunion;
	}

	public List<Participant> getListParticipant() {
		return listParticipant;
	}

	public void setListParticipant(List<Participant> listParticipant) {
		this.listParticipant = listParticipant;
	}


	
}
