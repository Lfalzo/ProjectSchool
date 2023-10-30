package com.example.ProjectSchool.controller;

import com.example.ProjectSchool.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @RequestMapping("/teachers")
    public String AllTeachers(Model teachersContainer){

        teachersContainer.addAttribute("teachersAll",teacherService.getAllTeachers());

        return "teachers.html";
    }
}
