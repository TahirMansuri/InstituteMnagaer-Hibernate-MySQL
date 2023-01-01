package com.infogalaxy.hibernatedemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

	//# cid, cname, cfees

	@Id
	@Column( name = "cid")
	private int cid;
	
	@Column( name = "cname" )
	private String cname;
	
	@Column( name = "cfees" )
	private String cfees;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCfees() {
		return cfees;
	}

	public void setCfees(String cfees) {
		this.cfees = cfees;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cfees=" + cfees + "]";
	}
	
	
}
