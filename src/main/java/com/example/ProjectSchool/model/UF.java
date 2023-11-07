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

    public String getNameUF() {
        return nameUF;
    }

    public void setNameUF(String nameUF) {
        this.nameUF = nameUF;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getCodiUF() {
        return codiUF;
    }

    public void setCodiUF(String codiUF) {
        this.codiUF = codiUF;
    }
}
