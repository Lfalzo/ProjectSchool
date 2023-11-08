package com.example.ProjectSchool.controller;

import com.example.ProjectSchool.model.Cycle;
import org.springframework.ui.Model;

import com.example.ProjectSchool.service.CycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping("/editcycle/{codiCycle}")
    public ModelAndView EditCycle(@PathVariable(name = "codiCycle") String codiCycle){
        ModelAndView mav = new ModelAndView("edit_cycle.html");
        Cycle cycle = cycleService.getCycle(codiCycle);
        mav.addObject("cycle",cycle);

        return mav;
    }
    @RequestMapping("/deletecycle/{codiCycle}")
    public String deleteCycle(@PathVariable(name = "codiCycle") String codiCycle){
        cycleService.deleteCycle(codiCycle);
        return "redirect:/cycles";
    }
}
