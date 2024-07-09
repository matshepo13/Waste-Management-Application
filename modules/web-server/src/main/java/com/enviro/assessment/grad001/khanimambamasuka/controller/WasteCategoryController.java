package com.enviro.assessment.grad001.com.enviro.assessment.grad001.matsheposoto.controller;

import com.enviro.assessment.grad001.com.enviro.assessment.grad001.matsheposoto.WasteCategory;
import com.enviro.assessment.grad001.com.enviro.assessment.grad001.matsheposoto.dto.WasteCategoryDTO;
import com.enviro.assessment.grad001.com.enviro.assessment.grad001.matsheposoto.dto.WasteCategoryDTOMapper;
import com.enviro.assessment.grad001.com.enviro.assessment.grad001.matsheposoto.services.WasteCategoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/category")
@RestController
public class WasteCategoryController {
    private final WasteCategoryService wasteCategoryService;
    private final WasteCategoryDTOMapper wasteCategoryDTOMapper;

    public WasteCategoryController(WasteCategoryService wasteCategoryService
            , WasteCategoryDTOMapper wasteCategoryDTOMapper) {
        this.wasteCategoryService = wasteCategoryService;
        this.wasteCategoryDTOMapper = wasteCategoryDTOMapper;
    }

    @GetMapping
    public ResponseEntity<Page<WasteCategoryDTO>> getAllWasteCategories(Pageable pageable) {
        Page<WasteCategoryDTO> pickupSchedules =
                wasteCategoryDTOMapper.toWasteCategoryDTOs(
                        wasteCategoryService.getAllWasteCategories(pageable));
        return ResponseEntity.ok(pickupSchedules);
    }

    @PostMapping("/save")
    public ResponseEntity<WasteCategoryDTO> save(@RequestBody WasteCategoryDTO dto) {
        WasteCategory save = wasteCategoryService.save(wasteCategoryDTOMapper.toWasteCategory(dto));
        return ResponseEntity.ok(wasteCategoryDTOMapper.toWasteCategoryDTO(save));
    }
}
