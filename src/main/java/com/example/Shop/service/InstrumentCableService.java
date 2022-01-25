package com.example.Shop.service;

import com.example.Shop.Repository.InstrumentCableRepository;
import com.example.Shop.model.InstrumentCable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstrumentCableService {

    private InstrumentCableRepository instrumentCableRepository;

    InstrumentCableService(InstrumentCableRepository instrumentCableRepository) {
        this.instrumentCableRepository = instrumentCableRepository;
    }



    public void saveInstrumentCable(InstrumentCable instrumentCable){
        instrumentCableRepository.save(instrumentCable);
    }

    public List<InstrumentCable> findAll(){
        return  instrumentCableRepository.findAll();
    }

    public  InstrumentCable findById( long id)
    {
        return instrumentCableRepository.findInstrumentCableById(id);
    }

    public List<InstrumentCable> findAllShowAndInQuality(){
        return  instrumentCableRepository.findInstrumentCablesByIsShowAndQuantityIsAfter(true , 0);}

    public List<InstrumentCable> findAllShowAndInNoQuality(){
        return  instrumentCableRepository.findInstrumentCablesByIsShowAndQuantity(true , 0);}
}
