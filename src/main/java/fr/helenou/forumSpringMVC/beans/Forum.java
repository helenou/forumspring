package fr.helenou.forumSpringMVC.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @NoArgsConstructor @ToString(callSuper = true)
public class Forum {
	private String name;
	private String type;
	private String description;
	
	@OneToMany
	private List<Post> posts;
	
	public Forum(String name, String type, String description) {
		super();
		this.name = name;
		this.type = type;
		this.description = description;
	}
	
	
	
}
