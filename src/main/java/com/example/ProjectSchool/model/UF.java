package com.example.ProjectSchool.model;

public class UF {
    private String nameUF;
    private int hours;
    private String codiUF;

    public UF(String nameUF, int hours, String codiUF){
        this.nameUF = nameUF;
        this.hours = hours;
        this.codiUF = codiUF;
    }
    public String getNameUF(){
        return this.nameUF;
    }
    public int getHours(){
        return this.hours;
    }

    public String getCodiUF(){
        return this.codiUF;
    }

}
