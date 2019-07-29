package com.voizfonica.webapp.Controller;


import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class HomeController {

    @GetMapping("/Ppolicy")
    public String policyfunc()
    {
        return "Ppolicy";
    }

    @GetMapping("/careers")
    public String careerfunc()
    {
        return "careers";
    }

}