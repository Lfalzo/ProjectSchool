package com.example.ProjectSchool.model;


import jakarta.persistence.*;

@Entity
public class Cycle {
    @Id
    private String codiCycle;
    private String nameCycle;
    private int qttUFs;
    private int hours;
    public Cycle(){}

    public Cycle(String codiCycle, String nameCycle, int hours, int qttUFs){
        this.codiCycle = codiCycle;
        this.nameCycle = nameCycle;
        this.hours = hours;
        this.qttUFs = qttUFs;
    }
    public String getCodiCycle() {
        return codiCycle;
    }
    public String getNameCycle() {
        return nameCycle;
    }
    public void setNameCycle(String nameCycle) {
        this.nameCycle = nameCycle;
    }
    public int getQttUFs() {
        return qttUFs;
    }
    public void setQttUFs(int qttUFs) {
        this.qttUFs = qttUFs;
    }
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public void setCodiCycle(String codiCycle) {
        this.codiCycle = codiCycle;
    }

    /*CREATE TABLE cycle(
	codiCycle VARCHAR(5) PRIMARY KEY,
	nameCycle VARCHAR(100),
	qttUFs INT,
	hours INT
);

CREATE TABLE student(
	DNI VARCHAR(10) PRIMARY KEY,
	nameStudent  VARCHAR(100),
	phone VARCHAR(10),
	mail VARCHAR(80),
	active BIT
);

CREATE TABLE teacher(
	DNI VARCHAR(10) PRIMARY KEY,
	nameTeacher VARCHAR(100),
	phone VARCHAR(10),
	mail VARCHAR(80)
);

CREATE TABLE uf(
	codiUF VARCHAR(8) PRIMARY KEY,
	nameUF VARCHAR(50),
	hours INT
);*/
}
