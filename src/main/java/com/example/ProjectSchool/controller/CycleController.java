package com.example.ProjectSchool.controller;

import com.example.ProjectSchool.model.Cycle;
import org.springframework.ui.Model;

import com.example.ProjectSchool.service.CycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CycleController {

    @Autowired
    CycleService cycleService;

    @RequestMapping("/cycles")
    public String AllCycles (Model cyclesContainer){

        Iterable<Cycle> listCycles = cycleService.listAllCycles();
        cyclesContainer.addAttribute("cyclesAll", listCycles);
        //cyclesContainer.addAttribute("cyclesAll", cycleService.getAllCycles());
        return "cycles.html";
    }

    @RequestMapping("/newcycle")
    public String NewCycle(Model model){
        Cycle cycle = new Cycle();
        model.addAttribute("cycle",cycle);
        return "new_cycle.html";
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String saveCycle(@ModelAttribute("cycle") Cycle cycle){
        cycleService.saveCycle(cycle);

        return "redirect:/cycles";
    }
}
