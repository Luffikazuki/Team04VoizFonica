package com.example.samples;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Arrays;
import java.util.List;
@Slf4j
@Controller
@RequestMapping("/plan")
public class PlanController {
    @GetMapping
    @ModelAttribute
    public String getPlan(Model model){
        List<Plan> plans = Arrays.asList(
                new Plan(101, "PrePaid"),
                new Plan(102,"PostPaid"),
                new Plan(103,"Dongle")
        );

        model.addAttribute("plans",plans);

        return "plan";
    }
}
