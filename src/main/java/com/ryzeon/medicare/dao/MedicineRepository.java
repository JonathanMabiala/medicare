package com.ryzeon.medicare.dao;

import com.ryzeon.medicare.entity.Medicine;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@RepositoryRestResource(collectionResourceRel = "medicine",path="medicine")
@CrossOrigin("http://localhost:4200")
public interface MedicineRepository extends JpaRepository<Medicine, Long> {

    Page<Medicine> findByCategoryId(@RequestParam("id") int id, Pageable pageable);

    Page<Medicine> findByNameContaining(@RequestParam("name") String name, Pageable pageable);
}
