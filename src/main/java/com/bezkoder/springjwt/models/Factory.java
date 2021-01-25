package com.bezkoder.springjwt.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "factory")
public class Factory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 30)
	private String name;

	@OneToMany(mappedBy="factory", fetch = FetchType.EAGER)
	private Set<Line> lines;

	public Factory() {}

	public Factory(String name) {
		this.name = name;
	}

	public Factory(String name, Set<Line> lines) {
		this.name = name;
		this.lines = lines;
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

	public Set<Line> getLines() {
		return lines;
	}

	public void setLines(Set<Line> lines) {
		this.lines = lines;
	}
}