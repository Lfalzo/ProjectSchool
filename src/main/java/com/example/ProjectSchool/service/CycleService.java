package com.example.ProjectSchool.service;

import com.example.ProjectSchool.Repository.CycleRepository;
import com.example.ProjectSchool.model.Cycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CycleService {
    @Autowired
    private CycleRepository repoCycle;
    //static ArrayList<Cycle> listCycles = new ArrayList<>();

    public Iterable<Cycle> listAllCycles(){
        //System.out.println(repoCycle.findAll());

        return repoCycle.findAll();
    }
    /*public ArrayList<Cycle> getAllCycles() {
        return listCycles;
    }*/
    /*public Cycle findCycleByCodi(String codi){
        Cycle cycleFound = null;
        for (Cycle cycle : listCycles){
            boolean checkCycle = cycle.getCodiCycle().equals(codi);
            if (checkCycle){
                cycleFound = cycle;
                break;
            }
        }
        return cycleFound;
    }*/
    public void saveCycle(Cycle cycle){
        repoCycle.save(cycle);
    }
}

