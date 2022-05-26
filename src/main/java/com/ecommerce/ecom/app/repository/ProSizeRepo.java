package com.ecommerce.ecom.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.ecom.app.domain.Size;

@Repository
public interface ProSizeRepo extends JpaRepository<Size, Long> {

}
