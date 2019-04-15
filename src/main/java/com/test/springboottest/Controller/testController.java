package com.test.springboottest.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class testController {

    @RequestMapping("/hello")
    public String tett(){
        log.info("info -> {}"," hello spring boot tset");
        return "boot spring";
    }
}
