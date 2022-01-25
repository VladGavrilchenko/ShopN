package com.example.Shop.service;


import com.example.Shop.Repository.TextInPageRepository;
import com.example.Shop.model.TextInPage;
import org.springframework.stereotype.Service;

@Service
public class TextInPageService {


    private TextInPageRepository textInPageRepository;

    TextInPageService(TextInPageRepository textInPageRepository){
        this.textInPageRepository =textInPageRepository;
    }

    public TextInPage getAbout(){
        return  textInPageRepository.findTextInPageByNameTextEquals("about");
    }
    public TextInPage getContactPhone(){
        return  textInPageRepository.findTextInPageByNameTextEquals("contactPhone");
    }

    public TextInPage getContactEmail(){
        return  textInPageRepository.findTextInPageByNameTextEquals("contactEmail");
    }
    public void  save( TextInPage textInPage){
        textInPageRepository.save(textInPage);
    }
}
