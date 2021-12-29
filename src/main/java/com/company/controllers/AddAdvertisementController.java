package com.company.controllers;


import com.company.domain.Advertisement;
import com.company.domain.User;
import com.company.repo.AdvertisementRepo;
import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.UUID;
import java.util.logging.Logger;

@RestController
@RequestMapping("/new-adv")
public class AddAdvertisementController {
    AdvertisementRepo advertisementRepo;
    private static Logger log = Logger.getLogger(AddAdvertisementController.class.getName());

//    @Value("${upload.path}")
//    private String uploadPath;

    @Autowired
    public AddAdvertisementController(AdvertisementRepo advertisementRepo) {
        this.advertisementRepo = advertisementRepo;
    }

    @PostMapping()
    public void newAdvertisement(@RequestBody Advertisement advertisement,
                                          @AuthenticationPrincipal User user
    ){
        advertisement.setDateOfPlacement(LocalDateTime.now());
        advertisement.setUserEmail(user.getEmail());
        advertisementRepo.save(advertisement);
    }

//    @PostMapping(value=("/photo"),headers=("content-type=multipart/*"))
//    public void newAdvertisementPhoto(@RequestParam("file") MultipartFile file) throws IOException {
//        if (file != null && !file.getOriginalFilename().isEmpty()) {
//            File uploadDir = new File(uploadPath);
//
//            if (!uploadDir.exists()) {
//                uploadDir.mkdir();
//            }
//
//            String uuidFile = UUID.randomUUID().toString();
//            String resultFilename = uuidFile + "." + file.getOriginalFilename();
//            //file.transferTo(Paths.get(uploadPath + "/" + resultFilename));
////            file.transferTo(new File(uploadPath + "/" + resultFilename));
//
//        }
//    }
}
