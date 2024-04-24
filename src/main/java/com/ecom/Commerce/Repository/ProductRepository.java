package com.ecom.Commerce.Repository;

// ProductRepository.java
import com.ecom.Commerce.Modle.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
