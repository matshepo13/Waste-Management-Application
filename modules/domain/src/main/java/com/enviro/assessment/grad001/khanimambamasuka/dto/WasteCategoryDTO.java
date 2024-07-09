package com.enviro.assessment.grad001.khanimambamasuka.dto;

import java.io.Serial;

public class WasteCategoryDTO extends DTO {
    @Serial
    private static final long serialVersionUID = 6738519974723746023L;
    private String id;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}