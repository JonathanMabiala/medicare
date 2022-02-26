package com.ryzeon.medicare.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ryzeon.medicare.entity.Medicine;

@RepositoryRestResource(path="medicine")
public interface MedicineRepository extends JpaRepository<Medicine, Integer> {

}
