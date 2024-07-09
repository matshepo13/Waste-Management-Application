package com.enviro.assessment.grad001.khanimambamasuka;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serial;

@Entity
@Table(name = "waste_category")
public class WasteCategory extends ReferenceData {
    @Serial
    private static final long serialVersionUID = -8805925375746644404L;
}
