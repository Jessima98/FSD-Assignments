package com.jessi.springboot.model;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pay")
public class Pay {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "fname")
	private String fname;

	@Column(name = "lname")
	private String lname;

	@Column(name = "country")
	private String country;
	@Column(name = "address")
	private String address;;
	
	 public Pay() {
	    }
	    public Pay( String fname, 
	                 String lname, String country, String address) {
	        this.fname = fname;
	        this.lname = lname;
	        this.country=country;
	        this.address=address;
	       
	    }
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country=country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address=address;
	}
	
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof User)) return false;
//        User user = (User) o;
//        return Objects.equals(name, user.name) &&
//                Objects.equals(password, user.password);
//    }
	
}