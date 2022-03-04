package com.ryzeon.medicare.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name="medicine")
@Getter
@Setter

public class Medicine {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="price")
	private double price;
	
	@Column(name="seller")
	private String seller;

	@Column(name="image_url")
	private String imageUrl;
	
	@Column(name="status")
	private String status;

	//@ManyToOne
	@Column(name = "category_id")
	private int categoryId;

	
	
	//Constructor
	public Medicine() {
		
	}



	
	
	

}
