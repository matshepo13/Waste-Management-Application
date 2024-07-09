package com.enviro.assessment.grad001.khanimambamasuka.dto;

import com.enviro.assessment.grad001.khanimambamasuka.WasteCategory;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.springframework.data.domain.Page;

@Mapper(componentModel = "spring"
        , unmappedTargetPolicy = ReportingPolicy.ERROR)
public abstract class WasteCategoryDTOMapper {
    public abstract WasteCategoryDTO toWasteCategoryDTO(WasteCategory source);

    @Mapping(target = "id", ignore = true)
    public abstract WasteCategory toWasteCategory(WasteCategoryDTO source);

    public Page<WasteCategoryDTO> toWasteCategoryDTOs(Page<WasteCategory> source) {
        return source.map(this::toWasteCategoryDTO);
    }
}
