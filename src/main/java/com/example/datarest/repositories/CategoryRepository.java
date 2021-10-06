package com.example.datarest.repositories;

import com.example.datarest.entity.Category;
import com.example.datarest.projection.CategoryProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "category",excerptProjection = CategoryProjection.class)
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
