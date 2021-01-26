package com.inpyohong.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class WebController {
    @GetMapping("/")
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/project-1")
    public String project1(Model model) {
        return "project-1";
    }

    @GetMapping("/project-2")
    public String project2(Model model) {
        return "project-2";
    }

    @GetMapping("/project-3")
    public String project3(Model model) {
        return "project-3";
    }

    @GetMapping("/project-4")
    public String project4(Model model) {
        return "project-4";
    }
}
