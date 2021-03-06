package com.example.Shop.Repository;

import com.example.Shop.model.Guitar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuitarRepository extends JpaRepository<Guitar, Long> {
    Guitar findGuitarById(long id);
    List<Guitar> findGuitarsByIsShowAndQuantity(boolean show , int quantity);
    List<Guitar> findGuitarsByIsShowAndQuantityIsAfter(boolean show , int quantity);


}
