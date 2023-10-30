package com.example.ProjectSchool.controller;

import org.springframework.ui.Model;

import com.example.ProjectSchool.service.CycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CycleController {

    @Autowired
    CycleService cycleService;

    @RequestMapping("/cycles")
    public String AllCycles (Model cyclesContainer){

        cyclesContainer.addAttribute("cyclesAll", cycleService.getAllCycles());
        return "cycles.html";
    }
}
