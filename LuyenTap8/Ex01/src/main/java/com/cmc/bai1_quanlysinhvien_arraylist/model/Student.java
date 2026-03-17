package com.cmc.bai1_quanlysinhvien_arraylist.model;

public class Student {
    private String mssv;
    private String ten;
    private double gpa;

    public Student() {
    }

    public Student(String mssv, String ten, double gpa) {
        this.mssv = mssv;
        this.ten = ten;
        this.gpa = gpa;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("MSSV: %s | Ten: %s | GPA: %.2f", mssv, ten, gpa);
    }
}