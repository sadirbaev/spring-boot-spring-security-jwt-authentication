package com.bezkoder.springjwt.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "line")
public class Line {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 30)
	private String name;

	@ManyToOne
	@JoinColumn(name = "factory_id")
	private Factory factory;

	public Line() {}

	public Line(String name, Factory factory) {
		this.name = name;
		this.factory = factory;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Factory getFactory() {
		return factory;
	}

	public void setFactory(Factory factory) {
		this.factory = factory;
	}
}