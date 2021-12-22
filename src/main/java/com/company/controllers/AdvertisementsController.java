package com.company.controllers;


import com.company.domain.Advertisement;
import com.company.domain.User;
import com.company.domain.Views;
import com.company.repo.AdvertisementRepo;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/list-adv")
    public List<Advertisement> getListOfAdv(@RequestParam("type")  String type,
                                            @RequestParam("rooms")  String rooms,
                                            @RequestParam("price")  String price,
                                            @AuthenticationPrincipal User user) {
        System.out.println(rooms);
        System.out.println(type);
        System.out.println(price);
        return advertisementRepo.findAdvertisementByTypeAndNumberOfRoomsAndPrice(type, rooms, price);

    }

    @GetMapping("/uesr-adv")
    public List<Advertisement> getuserAdv(@RequestParam("email") String email) {
        return advertisementRepo.findByUserEmail(email);
    }
}
