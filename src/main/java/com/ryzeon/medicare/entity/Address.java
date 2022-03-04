package com.ryzeon.medicare.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="address")
@Getter
@Setter
public class Address {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;
	
	@Column(name="zip_code")
	private String zipCode;
	
	@Column(name="country")
	private String country;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private  Order order;

	
	
	
	//constructors
	public Address() {
		
	}

	public Address(String street, String city, String zipCode, String country) {
		
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
		this.country = country;

	}
	
	
	
	
	

}
