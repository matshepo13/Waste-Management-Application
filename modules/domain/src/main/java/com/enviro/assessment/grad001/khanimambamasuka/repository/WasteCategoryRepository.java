package com.enviro.assessment.grad001.com.enviro.assessment.grad001.matsheposoto.repository;

import com.enviro.assessment.grad001.com.enviro.assessment.grad001.matsheposoto.WasteCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WasteCategoryRepository
        extends CrudRepository<WasteCategory, String> {
    Page<WasteCategory> findAll(Pageable pageable);
}
