package com.mv.entity;

import java.sql.Time;

public class Student_Record {

    private int id;
    private int stuId;
    private String stuName;
    private int subId;
    private String subName;

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    private double Score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getSubId() {
        return subId;
    }

    public void setSubId(int subId) {
        this.subId = subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public Time getExaTime() {
        return exaTime;
    }

    public void setExaTime(Time exaTime) {
        this.exaTime = exaTime;
    }

    private Time exaTime;

    @Override
    public String toString() {
        return "Student_Record[StuNam=" + getStuName() + "],[SubName=" + getSubName() + "],[Score=" + getScore() + "],[ExaTime=" + getExaTime() + "]";
    }
}