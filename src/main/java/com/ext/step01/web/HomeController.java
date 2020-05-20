package com.ext.step01.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/movie")
    public String searchMovie() {
        return "movie";
    }
}
