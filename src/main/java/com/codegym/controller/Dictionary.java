package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Dictionary {
    @GetMapping("/dich")
    public String index(){
        return "index";
    }
    @GetMapping("/submit")
    public String submit(@RequestParam String word, Model model){
        String result = "";
        switch (word){
            case "love":
                result = "yeu";
                break;
            case "hate":
                result = "ghet";
                break;
            default: result = "khong biet";
        }
        model.addAttribute("result", result);
        return "result";
    }
}
