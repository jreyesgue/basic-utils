package com.deloitte.BasicUtils.entity;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private String name;
    private String grade;
    private Map<String, Double> signatures;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        signatures = new HashMap<>();
    }

    public void addSignature(String name, double grade) {
        signatures.put(name, grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Map<String, Double> getSignatures() {
        return signatures;
    }

    public void setSignatures(Map<String, Double> signatures) {
        this.signatures = signatures;
    }

}
