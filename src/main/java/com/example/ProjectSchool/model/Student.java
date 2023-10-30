package com.example.ProjectSchool.model;

public class Student {
    private String DNI;
    private String nameStudent;
    private String phone;
    private Boolean active;

    public Student(String dni,String nameStudent, String phone, Boolean active){
        this.DNI = dni;
        this.nameStudent = nameStudent;
        this.phone = phone;
        this.active = active;
    }

    public String getDNI(){
        return this.DNI;
    }
    public String getNameStudent(){
        return this.nameStudent;
    }
    public String getPhone(){
        return this.phone;
    }
    public Boolean getActive(){
        return this.active;
    }

    public void learn(){

    }
    public void practice(){

    }
}
