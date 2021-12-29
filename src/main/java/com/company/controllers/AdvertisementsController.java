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
                                            @RequestParam("price_ot")  String price_ot,
                                            @RequestParam("price_do") String price_do,
                                            @AuthenticationPrincipal User user) {
        int price_from = 0;
        int price_to = 0;
        if(price_ot != "")price_from = Integer.parseInt(price_ot);
        if(price_do != "")price_to = Integer.parseInt(price_do);
        return advertisementRepo.findAdvertisementByTypeAndNumberOfRoomsAndPrice(type, rooms, price_from, price_to);

    }

    @GetMapping("/user-adv")
    public List<Advertisement> getUserAdv(@RequestParam("email") String email) {
        return advertisementRepo.findByUserEmail(email);
    }
}
