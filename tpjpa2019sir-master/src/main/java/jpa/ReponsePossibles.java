package jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class ReponsePossibles {

	@Id @GeneratedValue
	long idRepPoss;

	Date d;
	
	@ManyToOne
	Reunion reunion;
	
	public ReponsePossibles() {
	}

	public long getId() {
		return idRepPoss;
	}

	public void setId(long id) {
		this.idRepPoss = id;
	}

	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}

	public Reunion getR() {
		return reunion;
	}

	public void setR(Reunion r) {
		this.reunion = r;
	}

}
