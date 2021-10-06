package com.example.datarest.repositories;

import com.example.datarest.projection.measurmentProjection;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "measurment",excerptProjection = measurmentProjection.class)
public interface MeasurmentRepository {
}
