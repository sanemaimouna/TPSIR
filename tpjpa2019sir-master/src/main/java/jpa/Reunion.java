package jpa;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Reunion {
	
	@Id @GeneratedValue
	long idReunion;
	String intitule;
	String resume;
	
	@OneToMany(mappedBy="reunion")
	List<ReponsePossibles> listRepPoss;

	@ManyToOne
	Administrateur admin;
	
	@OneToMany(mappedBy="r")
	List<Reponse> listReponse;
	
	public Reunion() {
		
	}
	public long getId() {
		return idReunion;
	}

	public void setId(long id) {
		this.idReunion = id;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public List<ReponsePossibles> getListRepPoss() {
		return listRepPoss;
	}

	public void setListRepPoss(List<ReponsePossibles> listRepPoss) {
		this.listRepPoss = listRepPoss;
	}
}