package jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Reponse {
	@Id @GeneratedValue
	long idReponse;

	Date date;

	@ManyToOne
	Participant p;
	
	@ManyToOne
	Reunion r;

	public Reponse() {
		
	}
	public long getId() {
		return idReponse;
	}

	public void setId(long id) {
		this.idReponse = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Participant getP() {
		return p;
	}

	public void setP(Participant p) {
		this.p = p;
	}
	
}
