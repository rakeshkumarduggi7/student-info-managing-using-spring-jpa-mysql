package com.quizproject.quizproject;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
//use the classname same for the data table in mysql server also the variables
public class studentdb {

    @Id
    private int rollno;
    private String name;
    private String branch;

    public studentdb() {
    }

    public studentdb(String name, int rollno, String branch) {
        this.name = name;
        this.rollno = rollno;
        this.branch = branch;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
