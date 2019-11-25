package fr.helenou.forumSpringMVC.beans;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;  

@Entity
@Table(name="adresse")
@Getter @Setter @NoArgsConstructor
public class Address extends DbObject {

	private String adressePostale;
	@Pattern(regexp= "^[0-9]{5}$", message="saisir un code postal à 5 chiffres")
	private int codePostal;
	private String ville;
	
	public Address(String adressePostale, int codePostal, String ville) {
		super();
		this.adressePostale = adressePostale;
		this.codePostal = codePostal;
		this.ville = ville;
	}

}
