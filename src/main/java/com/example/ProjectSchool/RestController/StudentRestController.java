package com.example.ProjectSchool.RestController;

import com.example.ProjectSchool.model.Student;
import com.example.ProjectSchool.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/student/")
public class StudentRestController {
    @Autowired
    StudentService studentService;

    @GetMapping("/getAllStudents")
    public ArrayList<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/getStudentByDNI/{dni}")
    public Student getStudentByDNI(@PathVariable String dni){
        Student student = null;

        student = studentService.findStudentByDNI(dni);

        return student;
    }
}
