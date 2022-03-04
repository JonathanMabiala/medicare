package com.ryzeon.medicare.dao;

import com.ryzeon.medicare.entity.MedicineCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "medicineCategory",path="medicine-category")
@CrossOrigin("http://localhost:4200")
public interface MedicineCategoryRepository extends JpaRepository <MedicineCategory, Long>{

}
