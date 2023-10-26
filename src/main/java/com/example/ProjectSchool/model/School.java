package com.example.ProjectSchool.model;

public class School {
    private String address;
    private String nameSchool;
    private int qttStudents;

    public School(){
        this.address = "Plaça del Comte de Sert, 25";
        this.nameSchool = "CIFO Barcelona - La Violeta";
        this.qttStudents = 0;

    }
    public void registerStudents(){

    }
    public int getQttStudents(){
        return this.qttStudents;
    }
    public String getAddress(){
        return this.address;
    }
    public String getNameSchool(){
        return this.nameSchool;
    }
}
