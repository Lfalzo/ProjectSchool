package com.example.ProjectSchool.model;

public class Cycle {
    private String nameCycle;
    private int qttUFs;
    private int hours;
    private String codiCycle;

    public Cycle(String codiCycle, String nameCycle, int hours, int qttUFs){
        this.codiCycle = codiCycle;
        this.nameCycle = nameCycle;
        this.hours = hours;
        this.qttUFs = qttUFs;
    }
    public String getNameCycle(){
        return this.nameCycle;
    }
    public int getQttUFs(){
        return this.qttUFs;
    }
    public int getHours(){
        return this.hours;
    }

    public String getCodiCycle(){
        return this.codiCycle;
    }
}
