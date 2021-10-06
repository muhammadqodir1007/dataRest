package com.example.datarest.projection;

import com.example.datarest.entity.Measurment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Measurment.class)
public interface measurmentProjection {

    String getName();
    boolean getActive();
}
