package fr.helenou.forumSpringMVC.beans;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="posts")
@Getter @Setter @NoArgsConstructor
public class Post extends DbObject {
	
	private int userId;
	private String title;
	private String type;
	private String description;
	
	
}
