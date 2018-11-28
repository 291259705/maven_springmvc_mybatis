package com.mv.entity;

import java.util.List;

public class Student_Subject {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public List<Student_Record> getRecords() {
        return records;
    }

    public void setRecords(List<Student_Record> records) {
        this.records = records;
    }

    private List<Student_Record> records;
}
