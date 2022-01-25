package com.example.Shop.service;

import com.example.Shop.Repository.ImageRepository;
import com.example.Shop.model.ImageOfProduct;
import org.springframework.stereotype.Service;


@Service
public class ImageService {

    private ImageRepository imageRepository;

    public  ImageService(ImageRepository imageRepository)
    {
        this.imageRepository = imageRepository;
    }


    public void addImage(ImageOfProduct image)
    {
        imageRepository.save(image);
    }
}
