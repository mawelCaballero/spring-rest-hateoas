package com.opencredo.demo.hateoas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Tag extends AbstractPersistable<Long> {
	private static final long serialVersionUID = 4890085128347271414L;

	@Column(unique = true)
	private String name;

	private String frequency;

	public Tag() {
	}

	public Tag(String name, String frequency) {

		this.name = name;
		this.frequency = frequency;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

}
