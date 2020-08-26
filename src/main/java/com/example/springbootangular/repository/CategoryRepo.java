package com.example.springbootangular.repository;

import com.example.springbootangular.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel = "category", path = "product-category")
public interface CategoryRepo extends JpaRepository<Category, Long> {

}
