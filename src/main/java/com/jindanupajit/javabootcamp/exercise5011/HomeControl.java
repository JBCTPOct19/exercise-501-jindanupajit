package com.jindanupajit.javabootcamp.exercise5011;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControl {
    @RequestMapping(value={"/","/home"})
    public String homePage() {
        return "index";
    }

    @RequestMapping("/about")
    public String aboutPage() {
        return "about";
    }

    @RequestMapping("/contact")
    public String contactPage() {
        return "contact";
    }
}
