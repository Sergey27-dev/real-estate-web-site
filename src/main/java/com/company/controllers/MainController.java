package com.company.controllers;

import com.company.domain.Advertisement;
import com.company.domain.Views;
import com.company.repo.AdvertisementRepo;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("mainpage")
public class MainController {

    private final AdvertisementRepo advertisementRepo;

    @Autowired
    public MainController(AdvertisementRepo advertisementRepo) {
        this.advertisementRepo = advertisementRepo;
    }

    @GetMapping()
    @JsonView(Views.ShortInformation.class)
    public List<Advertisement> index(){
        return advertisementRepo.findAll();
    }
}
