package fr.helenou.forumSpringMVC.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import fr.helenou.forumSpringMVC.beans.Address;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserForm {
	
	@NotNull
	@Size(min=2,max=40)
	private String name;
	
	@Pattern(regexp="^[0-9].{10}$", message="No Mobile à 10 chiffres")
	private String mobile;
		
	@NotNull
	@Pattern(regexp ="^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", message="email invalide")
	private String email;
	
	@Size(min=4, max=12)
	private String username;
	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", message="Your password needs a digit, both lower and upper case letter at least once, a special character, no whitespace, must be at least 8-length")

	private Address address;
	
	@NotNull
	@Size(min=4,max=40,message = "password entre 4 et 40 caractères")
	private String password;
	
	
}
	