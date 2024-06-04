package com.ivandjoh.myhtmx.demo1;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo1")
public class MessageController {

    @GetMapping("")
    public String index() {
        return "demo1/index";
    }

    @GetMapping("/banner")
    public String banner(Model model) {
        model.addAttribute("title", "ivandjoh.com");
        model.addAttribute("message","Load content on the webpage using htmx & spring");
        return "demo1/banner :: banner";
    }
}
