package com.ryzeon.medicare.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="medicine_category")
@Getter
@Setter
public class MedicineCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "category_name")
    private String categoryName;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
//    private Set<Medicine> medicines;

}
