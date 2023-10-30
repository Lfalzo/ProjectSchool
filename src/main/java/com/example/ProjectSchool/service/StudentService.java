package com.example.ProjectSchool.service;

import com.example.ProjectSchool.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {
    ArrayList<Student> listStudents = new ArrayList<>();
    public ArrayList<Student> getAllStudents(){
        return listStudents;
    }
    public Student findStudentByDNI(String dni) {

        Student studentFound = null;

        for (Student student : listStudents) {
            boolean checkStudent = student.getDNI().equals(dni);
            if (checkStudent){
                studentFound = student;
                break;
            }

        }
        return studentFound;
    }
}

