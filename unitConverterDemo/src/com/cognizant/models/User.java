package com.cognizant.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "users")
@Table(name = "users")
public class User implements Serializable {

	@Id
	@Column(name = "id")

	int ID;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;

	}

	@Column(name = "name")
	private String name;
	@Column(name = "password")
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
