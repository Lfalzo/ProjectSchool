package com.example.ProjectSchool.service;

import com.example.ProjectSchool.model.Student;
import com.example.ProjectSchool.model.Teacher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TeacherService {
    ArrayList<Teacher> listTeacher = new ArrayList<>();

    public ArrayList<Teacher> getAllTeachers(){
        return listTeacher;
    }

    public Teacher findTeacherByDNI(String dni){
        Teacher teacherFound = null;

        for (Teacher teacher : listTeacher) {
            boolean checkTeacher = teacher.getDNI().equals(dni);
            if (checkTeacher){
                teacherFound = teacher;
                break;
            }

        }
        return teacherFound;
    }
}
