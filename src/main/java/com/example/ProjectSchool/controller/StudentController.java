package com.example.ProjectSchool.controller;

import com.example.ProjectSchool.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/students")
    public String AllStudents(Model studentsContainer){

        studentsContainer.addAttribute("studentsAl",studentService.getAllStudents());

        return "students.html";
    }
}
