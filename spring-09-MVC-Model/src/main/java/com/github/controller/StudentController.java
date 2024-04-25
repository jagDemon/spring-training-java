package com.github.controller;

import com.github.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {
    @RequestMapping("/welcome")
    public String homePage(Model model){

        //method model interface
        model.addAttribute("name","Cydeo");
        model.addAttribute("course","MVC");

        String a = "Tarik";
        String color = "red";

        int studentId = new Random().nextInt();
        model.addAttribute("studentId",studentId);
        model.addAttribute("a",a);
        model.addAttribute("color",color);


        List<Integer> nums = new ArrayList<Integer>();
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        model.addAttribute("nums",nums);
        Student student = new Student(1,"Tarik","Yilmaz");
        model.addAttribute("student",student);
        LocalTime dt = LocalTime.now();
        model.addAttribute("dt",dt);
        return "student/welcome";


    }
}
