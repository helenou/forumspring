package fr.helenou.forumSpringMVC.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;  

@Entity
@Table(name="user")
@Getter @Setter @NoArgsConstructor
public class User extends DbObject {

	private String name;
	private String mobile;
	private String email;
	private String username;
	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", message="Your password needs a digit, both lower and upper case letter at least once, a special character, no whitespace, must be at least 8-length")
	private String password;
	private Address address;
	@ManyToMany
	private List<Post> posts;
	
	public User(String name, String mobile, String email, String username, String password, Address address) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.username = username;
		this.password = password;
		this.address = address;
	}
	
	
}
