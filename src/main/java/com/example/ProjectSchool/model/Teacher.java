package com.example.ProjectSchool.model;

public class Teacher {
    private String DNI;
    private String nameTeacher;
    private String phone;
    private String mail;
    public Teacher(String dni, String nameTeacher, String phone, String mail){
        this.DNI = dni;
        this.nameTeacher = nameTeacher;
        this.phone = phone;
        this.mail = mail;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void teach(){

    }
    public void evaluate(){

    }
}
