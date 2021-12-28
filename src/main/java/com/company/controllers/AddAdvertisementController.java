package com.company.controllers;


import com.company.domain.Advertisement;
import com.company.domain.User;
import com.company.repo.AdvertisementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.UUID;
import java.util.logging.Logger;

@RestController
@RequestMapping("/new-adv")
public class AddAdvertisementController {
    AdvertisementRepo advertisementRepo;
    private static Logger log = Logger.getLogger(AddAdvertisementController.class.getName());

    @Value("${upload.path}")
    private String uploadPath;

    @Autowired
    public AddAdvertisementController(AdvertisementRepo advertisementRepo) {
        this.advertisementRepo = advertisementRepo;
    }

    @PostMapping()
    public void newAdvertisement(@RequestBody Advertisement advertisement,
                                          @AuthenticationPrincipal User user
    ){
//        List<File> files = advertisement.getFiles();
//        for(File file : files) {
//            System.out.println(file.getName());
//        }
        advertisement.setDateOfPlacement(LocalDateTime.now());
        advertisement.setUserEmail(user.getEmail());
        advertisementRepo.save(advertisement);
        System.out.println("piska");
    }

    @PostMapping("/photo")
    public void newAdvertisementPhoto(@RequestParam("file") MultipartFile file) throws IOException {
        System.out.println();
        if(file.isEmpty())System.exit(0);
        log.info("В методе");
        if (file != null && !file.getOriginalFilename().isEmpty()) {
            File uploadDir = new File(uploadPath);

            if (!uploadDir.exists()) {
                uploadDir.mkdir();
            }

            String uuidFile = UUID.randomUUID().toString();
            String resultFilename = uuidFile + "." + file.getOriginalFilename();

            file.transferTo(new File(uploadPath + "/" + resultFilename));

        }

    }
}
