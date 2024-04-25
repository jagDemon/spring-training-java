package com.github.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {
    //localhost:9090/info2?make=Honda
    @RequestMapping("/info")
    public String carInfo(@RequestParam String make, Model model){
        System.out.println(make);

        model.addAttribute("make", make);
        return "car/car-info";
    }
    //localhost:9090/info2
    @RequestMapping("/info2") //if our input is empty then print default value on website
    public String carInfo2(@RequestParam(value = "make", required = false, defaultValue = "KIA") String make, Model model){

        model.addAttribute("make", make);
        return "car/car-info";
    }
    //localhost:9090/info3?make=Honda&year=2022
    @RequestMapping("/info3")
    public String carInfo3(@RequestParam String make,@RequestParam int year, Model model){
        System.out.println(make);

        model.addAttribute("year", year);
        model.addAttribute("make", make);
        return "car/car-info";
    }

    @RequestMapping("/info/{make}/{year}") //localhost:9090/info/honda/2015
    public String getCarInfo(@PathVariable String make, @PathVariable int year){
        System.out.println(make);
        System.out.println(year);
        //honda
        return "car/car-info";
    }
}
