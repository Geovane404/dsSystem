package com.gtecnologia.appStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gtecnologia.appStore.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
