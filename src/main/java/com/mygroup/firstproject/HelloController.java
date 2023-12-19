package com.mygroup.firstproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/team11")
    @ResponseBody
    public String hello() {
        return "11조";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}