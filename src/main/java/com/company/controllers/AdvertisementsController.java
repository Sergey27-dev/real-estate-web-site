package com.company.controllers;


import com.company.domain.Advertisement;
import com.company.domain.Views;
import com.company.repo.AdvertisementRepo;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/adv")
public class AdvertisementsController {
    AdvertisementRepo advertisementRepo;

    @Autowired
    public AdvertisementsController(AdvertisementRepo advertisementRepo) {
        this.advertisementRepo = advertisementRepo;
    }

    @JsonView(Views.ShortInformation.class)
    @GetMapping
    public List<Advertisement> listAdv() {
        return advertisementRepo.findAll();
    }

    @JsonView(Views.FullInformation.class)
    @GetMapping("{id}")
    public Advertisement getOneAdv(@PathVariable ("id") Advertisement advertisement) {
        return advertisement;
    }
}
