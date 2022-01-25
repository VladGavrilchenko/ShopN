package com.example.Shop.service;

import com.example.Shop.Repository.GuitarСaseRepository;
import com.example.Shop.model.GuitarСase;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuitarСaseService {

    private GuitarСaseRepository guitarСaseRepository;

    GuitarСaseService(GuitarСaseRepository guitarСaseRepository) {
        this.guitarСaseRepository = guitarСaseRepository;
    }



    public void saveGuitarСase(GuitarСase guitarСase){
        guitarСaseRepository.save(guitarСase);
    }

    public List<GuitarСase> findAll(){
        return  guitarСaseRepository.findAll();
    }

    public  GuitarСase findById( long id)
    {
        return guitarСaseRepository.findGuitarСaseById(id);
    }

    public List<GuitarСase> findAllShowAndInQuality(){
        return  guitarСaseRepository.findGuitarСasesByIsShowAndQuantityIsAfter(true , 0);}

    public List<GuitarСase> findAllShowAndInNoQuality(){
        return  guitarСaseRepository.findGuitarСasesByIsShowAndQuantity(true , 0);}
}
