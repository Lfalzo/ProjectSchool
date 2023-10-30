package com.example.ProjectSchool.RestController;

import com.example.ProjectSchool.model.Teacher;
import com.example.ProjectSchool.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/teacher")
public class TeacherRestController {
    @Autowired
    TeacherService teacherService;

    @GetMapping("/getAllTeachers")
    public ArrayList<Teacher> getAllTeachers(){
        return teacherService.getAllTeachers();
    }
    @GetMapping("/getTeacherByDNI/{dni}")
    public Teacher getTeacherByDNI(@PathVariable String dni){

        Teacher teacher = null;

        teacher = teacherService.findTeacherByDNI(dni);

        return teacher;
    }
}
