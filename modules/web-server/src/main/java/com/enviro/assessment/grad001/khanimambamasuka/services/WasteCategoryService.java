package com.enviro.assessment.grad001.matsheposotoambamasuka.services;

import com.enviro.assessment.grad001.matsheposotoambamasuka.WasteCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface WasteCategoryService {
    Page<WasteCategory> getAllWasteCategories(Pageable pageable);

    WasteCategory save(WasteCategory pickupSchedule);
}
