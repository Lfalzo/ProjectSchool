package com.example.ProjectSchool.model;

public class Teacher {
    private String DNI;
    private String nameTeacher;
    private String phone;
    public Teacher(String dni, String nameTeacher, String phone){
        this.DNI = dni;
        this.nameTeacher = nameTeacher;
        this.phone = phone;
    }
    public String getDNI(){
        return this.DNI;
    }
    public String getNameTeacher()
    {
        return  this.nameTeacher;
    }

    public String getPhone(){
        return this.phone;
    }

    public void teach(){

    }
    public void evaluate(){

    }
}
