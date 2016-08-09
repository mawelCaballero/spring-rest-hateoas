package com.opencredo.demo.hateoas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class LookUp extends AbstractPersistable<Long> {
	private static final long serialVersionUID = 4890085128347271414L;

	@Column(unique = true)
	private String name;
	
	private String code; 
	
	private String type;
	
	private String position;

	public LookUp() {
	}

	public LookUp(String name, String code, String type, String position) {

		this.name = name;
		this.code = code;
		this.type = type; 
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}


	
	
}
