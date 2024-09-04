package com.edigest.myFirstProject.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelthCheck {


    @GetMapping("test")
    public String say()
    {
        return "Hello this is only health checking perpous";
    }

}
