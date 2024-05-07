package com.example.myfirstproject.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class Endpoints {
    
    @GetMapping("path/api/v1/{id}")
    public String getMethodName(@RequestParam String abc, @PathVariable String id) {

        return new String(abc+" "+ id);
    }
    
    @PostMapping("post/")
    public String postMethodName(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    
}
