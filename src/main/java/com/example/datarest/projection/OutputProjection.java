package com.example.datarest.projection;

import com.example.datarest.entity.Category;
import com.example.datarest.entity.Output;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Output.class)
public interface OutputProjection {

    int getId();

    String getName();
}
