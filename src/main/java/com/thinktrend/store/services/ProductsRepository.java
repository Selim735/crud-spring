package com.thinktrend.store.services;
import com.thinktrend.store.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository <Product, Integer>{

}
