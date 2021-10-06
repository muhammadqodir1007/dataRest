package com.example.datarest.projection;

import com.example.datarest.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CategoryProjection {

    int getId();

    String getName();
}
