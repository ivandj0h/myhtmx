package com.ivandjoh.myhtmx.demo2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/demo2")
public class WebLoaderController {

    private static final Logger log = LoggerFactory.getLogger(WebLoaderController.class);

    @GetMapping("")
    public String index() {
        return "demo2/index";
    }

    @PostMapping("/loadUrl")
    public String loadUrl(@RequestParam String url, Model model) {
        log.info("The URL requested: {}", url);
        model.addAttribute("url",url);
        return "demo2/website :: website";
    }
}
