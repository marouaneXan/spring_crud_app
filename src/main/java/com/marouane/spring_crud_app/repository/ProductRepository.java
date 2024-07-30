package com.marouane.spring_crud_app.repository;

import com.marouane.spring_crud_app.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
