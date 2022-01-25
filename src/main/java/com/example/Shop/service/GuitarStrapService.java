package com.example.Shop.service;

import com.example.Shop.Repository.GuitarStrapRepository;
import com.example.Shop.model.GuitarStrap;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuitarStrapService {

    private GuitarStrapRepository guitarStrapRepository;

    GuitarStrapService(GuitarStrapRepository guitarStrapRepository) {
        this.guitarStrapRepository= guitarStrapRepository;
    }



    public void saveGuitarStrap(GuitarStrap guitarStrap){
        guitarStrapRepository.save(guitarStrap);
    }
    public List<GuitarStrap> findAll(){
        return  guitarStrapRepository.findAll();
    }

    public  GuitarStrap findById( long id)
    {
        return guitarStrapRepository.findGuitarStrapById(id);
    }


    public List<GuitarStrap> findAllShowAndInQuality(){
        return  guitarStrapRepository.findGuitarStrapsByIsShowAndQuantityIsAfter(true , 0);}

    public List<GuitarStrap> findAllShowAndInNoQuality(){
        return  guitarStrapRepository.findGuitarStrapsByIsShowAndQuantity(true , 0);}
}
