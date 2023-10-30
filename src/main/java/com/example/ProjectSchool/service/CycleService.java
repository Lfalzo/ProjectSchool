package com.example.ProjectSchool.service;

import com.example.ProjectSchool.model.Cycle;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class CycleService {
    static ArrayList<Cycle> listCycles = new ArrayList<>();

    public ArrayList<Cycle> getAllCycles() {
        return listCycles;
    }
    public Cycle findCycleByCodi(String codi){
        Cycle cycleFound = null;
        for (Cycle cycle : listCycles){
            boolean checkCycle = cycle.getCodiCycle().equals(codi);
            if (checkCycle){
                cycleFound = cycle;
                break;
            }
        }
        return cycleFound;
    }
}

