package com.example.simple_r;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/map")
@Slf4j
public class RestDataController {

    @GetMapping("/get")
    public String getCall(){
        return "subash.pernndas.savari";
    }

    @GetMapping("/student")
    public StudentDTO studentDTO(){
        log.info("hello");
        return new StudentDTO("subash.pernandas.savari", 32);
    }

}
