package com.example.simple_r;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/map")
public class RestDataController {

    @GetMapping("/get")
    public String getCall(){
        return "subash.pernndas.savari";
    }
}
