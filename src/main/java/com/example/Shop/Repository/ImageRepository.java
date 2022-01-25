package com.example.Shop.Repository;


import com.example.Shop.model.ImageOfProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<ImageOfProduct, Long> {
}
