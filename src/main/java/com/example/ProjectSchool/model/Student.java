package com.example.ProjectSchool.model;

public class Student {
    private String DNI;
    private String nameStudent;
    private String phone;
    private String mail;
    private Boolean active;

    public Student(String dni,String nameStudent, String phone, String mail, Boolean active){
        this.DNI = dni;
        this.nameStudent = nameStudent;
        this.phone = phone;
        this.mail = mail;
        this.active = active;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void learn(){

    }
    public void practice(){

    }
}
