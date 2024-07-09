package com.enviro.assessment.grad001.khanimambamasuka.repository;

import com.enviro.assessment.grad001.khanimambamasuka.WasteCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WasteCategoryRepository
        extends CrudRepository<WasteCategory, String> {
    Page<WasteCategory> findAll(Pageable pageable);
}
