package com.enviro.assessment.grad001.com.enviro.assessment.grad001.matsheposoto.services.impl;

import com.enviro.assessment.grad001.com.enviro.assessment.grad001.matsheposoto.WasteCategory;
import com.enviro.assessment.grad001.com.enviro.assessment.grad001.matsheposoto.repository.WasteCategoryRepository;
import com.enviro.assessment.grad001.com.enviro.assessment.grad001.matsheposoto.services.WasteCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WasteCategoryServiceImpl implements WasteCategoryService {

    private final WasteCategoryRepository wasteCategoryRepository;

    public WasteCategoryServiceImpl(WasteCategoryRepository wasteCategoryRepository) {
        this.wasteCategoryRepository = wasteCategoryRepository;
    }

    @Override
    public Page<WasteCategory> getAllWasteCategories(Pageable pageable) {
        return wasteCategoryRepository.findAll(pageable);
    }

    @Override
    public WasteCategory save(WasteCategory wasteCategory) {
        return wasteCategoryRepository.save(wasteCategory);
    }
}
