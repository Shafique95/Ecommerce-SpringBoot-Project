package com.ecommerce.ecom.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecom.app.domain.Category;

public interface CategoryRepo extends JpaRepository<Category, Long> {

}
