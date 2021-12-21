package com.company.controllers;


import com.company.domain.Advertisement;
import com.company.domain.User;
import com.company.repo.AdvertisementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/new-adv")
public class AddAdvertisementController {
    AdvertisementRepo advertisementRepo;

    @Autowired
    public AddAdvertisementController(AdvertisementRepo advertisementRepo) {
        this.advertisementRepo = advertisementRepo;
    }

    @PostMapping()
    public Advertisement newAdvertisement(@RequestBody Advertisement advertisement,
                                          @AuthenticationPrincipal User user
    ){
        advertisement.setDateOfPlacement(LocalDateTime.now());
        advertisement.setUserEmail(user.getEmail());
        advertisementRepo.save(advertisement);
        return advertisement;
    }
}
