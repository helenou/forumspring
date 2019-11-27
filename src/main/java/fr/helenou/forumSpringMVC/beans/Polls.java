package fr.helenou.forumSpringMVC.beans;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="polls")
@Getter @Setter @NoArgsConstructor @ToString(callSuper = true)
public class Polls extends DbObject {
	private String name;
	private String type;
	private String description;
	
	public Polls(String name, String type, String description) {
		super();
		this.name = name;
		this.type = type;
		this.description = description;
	}
	
	
}
