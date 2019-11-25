package fr.helenou.forumSpringMVC.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="replies")
@Getter @Setter @NoArgsConstructor
public class Replies extends DbObject {

	private int replies_user_id;
	private String title;
	private String type;
	private String description;
	
	@ManyToOne
	private List<Replies> replies;
	
	public Replies(int replies_user_id, String title, String type, String description) {
		super();
		this.replies_user_id = replies_user_id;
		this.title = title;
		this.type = type;
		this.description = description;
	}

	
}
