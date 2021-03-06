package com.example.Shop.Repository;


import com.example.Shop.model.GuitarСase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuitarСaseRepository extends JpaRepository<GuitarСase,Long> {
    GuitarСase findGuitarСaseById(long id);
    List<GuitarСase> findGuitarСasesByIsShowAndQuantity(boolean show , int quantity);
    List<GuitarСase> findGuitarСasesByIsShowAndQuantityIsAfter(boolean show , int quantity);
}
