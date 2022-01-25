package com.example.Shop.Repository;

import com.example.Shop.model.ComboAmplifier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface СomboAmplifierRepository extends JpaRepository<ComboAmplifier,Long> {

    ComboAmplifier findСomboAmplifierById(long id);
    List<ComboAmplifier> findСomboAmplifiersByIsShowAndQuantityIsAfter(boolean show , int quantity);

    List<ComboAmplifier> findСomboAmplifiersByIsShowAndQuantity(boolean show , int quantity);
}
