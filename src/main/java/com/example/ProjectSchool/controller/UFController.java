package com.example.ProjectSchool.controller;

import com.example.ProjectSchool.service.UFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UFController {
    @Autowired
    UFService ufService;

    @RequestMapping("/ufs")
    public String AllUFs (Model uFsContainer){

        uFsContainer.addAttribute("uFsAll",ufService.getAllUFs());

        return "ufs.html";
    }
}
