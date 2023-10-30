package com.example.ProjectSchool.service;

import com.example.ProjectSchool.model.Cycle;
import com.example.ProjectSchool.model.UF;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UFService {
    ArrayList<UF> listUFs = new ArrayList<>();

    public ArrayList<UF> getAllUFs(){
        return listUFs;
    }
    public UF findUFByCodi(String codiUF){
        UF ufFound = null;
        for (UF uf : listUFs){
            boolean checkUF = uf.getCodiUF().equals(codiUF);
            if (checkUF){
                ufFound = uf;
                break;
            }
        }
        return ufFound;
    }
}
