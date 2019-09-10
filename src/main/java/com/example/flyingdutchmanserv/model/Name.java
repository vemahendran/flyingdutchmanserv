package com.example.flyingdutchmanserv.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Name {

	private String firstName;

	private String lastName;

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
