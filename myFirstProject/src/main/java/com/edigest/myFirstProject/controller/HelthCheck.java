package com.edigest.myFirstProject.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelthCheck {


    @GetMapping("test")
    public String say()
    {
        System.out.println("This is only local changes in this section");
        System.out.println("This is only local changes in this section");
      //  Method...
for(int i=0;i<=5;i++)
{
    System.out.println("Welcome");
}
        return "Hello this is only health checking perpous";

    }

}
