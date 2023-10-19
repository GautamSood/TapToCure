package com.fil.springrestdata.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trainee123")
public class Trainee {
	
	@Id
	@Column
	private long id;
	@Column
	private String name;
	@Column
	private String domain;
	@Column
	private String location;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Trainee(long id, String name, String domain, String location) {
		super();
		this.id = id;
		this.name = name;
		this.domain = domain;
		this.location = location;
	}
	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Trainee [id=" + id + ", name=" + name + ", domain=" + domain + ", location=" + location + "]";
	}


}
