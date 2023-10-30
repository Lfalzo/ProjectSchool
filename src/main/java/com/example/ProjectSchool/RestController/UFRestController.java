package com.example.ProjectSchool.RestController;

import com.example.ProjectSchool.model.UF;
import com.example.ProjectSchool.service.UFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/uf/")
public class UFRestController {
    @Autowired
    UFService ufService;

    @GetMapping("/getAllUFs")
    public ArrayList<UF> getAllUFs(){
        return ufService.getAllUFs();
    }

    @GetMapping("/getUFByCodi/{codi}")
    public UF getUFByCodi(@PathVariable String codi){

        UF uf = null;

        uf = ufService.findUFByCodi(codi);

        return uf;
    }
}
