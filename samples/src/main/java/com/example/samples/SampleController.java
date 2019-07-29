package com.example.samples;



import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;


@Controller
public class SampleController implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
    }

    @GetMapping("/")
    public String getCredentials(UserCredentials userCredentials){
        return "loginPage.html";
    }

    @PostMapping("/")
    public String showValidate(@Valid UserCredentials userCredentials, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "loginPage";
        }
        else{
            return "redirect:/plan";
        }
    }


}
