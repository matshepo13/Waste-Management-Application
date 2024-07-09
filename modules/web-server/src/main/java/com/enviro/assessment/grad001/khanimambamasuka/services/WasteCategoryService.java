package com.enviro.assessment.grad001.com.enviro.assessment.grad001.matsheposoto.services;

import com.enviro.assessment.grad001.com.enviro.assessment.grad001.matsheposoto.WasteCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface WasteCategoryService {
    Page<WasteCategory> getAllWasteCategories(Pageable pageable);

    WasteCategory save(WasteCategory pickupSchedule);
}
