package com.company.controllers;

import com.company.domain.Advertisement;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class AddAdvertisementControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;


    @Test
    void newAdvertisement() throws Exception {
        Advertisement advertisement = new Advertisement();
        advertisement.setName("Michail");
        advertisement.setAddres("Космический проспект 20");
        advertisement.setDescription("Description");
        advertisement.setFloor("5");
        advertisement.setTotalFloors("10");
        advertisement.setNumberOfRooms("2");


        mockMvc.perform(
                        post("/adv")
                                .content(objectMapper.writeValueAsString(advertisement))
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").isNumber())
                .andExpect(jsonPath("$.name").value("Michail"))
                .andExpect(jsonPath("$.price").value("20000"))
                .andExpect(jsonPath("$.addres").value("Космический проспект 20"))
                .andExpect(jsonPath("$.description").value("Description"))
                .andExpect(jsonPath("$.floor").value("5"))
                .andExpect(jsonPath("$.totalFloors").value("10"))
                .andExpect(jsonPath("$.numberOfRooms").value("2"));


    }


}