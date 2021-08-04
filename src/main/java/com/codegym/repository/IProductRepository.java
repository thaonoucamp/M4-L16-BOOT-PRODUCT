package com.codegym.repository;

import com.codegym.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepository extends JpaRepository<Product, Long>, CrudRepository<Product, Long> {
}
