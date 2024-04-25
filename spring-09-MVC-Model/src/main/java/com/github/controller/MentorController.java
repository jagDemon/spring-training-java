package com.github.controller;

import com.github.enums.Gender;
import com.github.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController {
    @RequestMapping("/main")
    public String main(Model model){

        List<Mentor> mentorsList = new ArrayList<Mentor>();
        mentorsList.add(new Mentor("Mike", "Smith", 45, Gender.MALE));
        mentorsList.add(new Mentor("Tom", "Hanks", 65, Gender.MALE));
        mentorsList.add(new Mentor("Tarik", "Yilmaz", 24, Gender.MALE));

        model.addAttribute("mentors", mentorsList);
        return "mentor/main";
    }
}
