package com.example.ProjectSchool.RestController;

import com.example.ProjectSchool.model.Cycle;
import com.example.ProjectSchool.service.CycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;

@RestController
@RequestMapping("api/v1/cycle/")
public class CycleRestController {
    @Autowired
    CycleService cycleService;

    @GetMapping("/getAllCycles")
    public Iterable<Cycle> getAllCycles(Model container){
        //ArrayList<Cycle> cyclesFromService = cycleService.getAllCycles();
        Iterable<Cycle> ciclos = cycleService.listAllCycles();
        System.out.println(ciclos);
        //return cycleService.getAllCycles();
        return  ciclos;
    }
    @GetMapping("/getCycleByCodi/{codi}")
    public Cycle getCycleByCodi(@PathVariable String codi){

        Cycle cycle = null;

        //cycle = cycleService.findCycleByCodi(codi);

        return cycle;
    }
}
