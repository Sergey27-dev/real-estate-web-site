package com.company.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("mainpage")
public class MainController {

    private List<Map<String, String>> messages = new ArrayList<Map<String,String>>(){{
       add(new HashMap<String, String>() {{put("id", "1"); put("message", "msg");}});
       add(new HashMap<String, String>() {{put("id", "2"); put("message", "m");}});
       add(new HashMap<String, String>() {{put("id", "3"); put("message", "ms");}});
    }};

    @GetMapping()
    public List<Map<String, String>> index(){
        return messages;
    }

}
