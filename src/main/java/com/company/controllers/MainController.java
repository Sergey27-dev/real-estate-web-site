package com.company.controllers;


import com.company.domain.Views;
import com.company.repo.AdvertisementRepo;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping("/")
public class MainController {

    private final AdvertisementRepo advertisementRepo;

    @Value("${spring.profiles.active}")  // Переменная окружения для определения dev режима
    private String profile;

    @Autowired
    public MainController(AdvertisementRepo advertisementRepo) {
        this.advertisementRepo = advertisementRepo;
    }


    @GetMapping
    @JsonView(Views.ShortInformation.class)
    public String main(Model model) {

        HashMap<Object, Object> data = new HashMap<>();

        data.put("adv", advertisementRepo.findAll());

        model.addAttribute("frontendData", data);

        model.addAttribute("isDevMode", "dev".equals(profile));

        return "index";
    }
}
