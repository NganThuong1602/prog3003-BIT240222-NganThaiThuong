package com.cmc.bai1_quanlysinhvien_arraylist.service;

import com.cmc.bai1_quanlysinhvien_arraylist.model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private final List<Student> students = new ArrayList<>();

    public boolean addStudent(Student student) {
        if (student == null || student.getMssv() == null || student.getMssv().isBlank()) {
            return false;
        }

        if (findByMssv(student.getMssv()) != null) {
            return false;
        }

        students.add(student);
        return true;
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sach sinh vien dang trong.");
            return;
        }

        System.out.println("===== DANH SACH SINH VIEN =====");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public List<Student> searchByName(String keyword) {
        List<Student> result = new ArrayList<>();

        if (keyword == null || keyword.isBlank()) {
            return result;
        }

        String lowerKeyword = keyword.toLowerCase();

        for (Student s : students) {
            if (s.getTen().toLowerCase().contains(lowerKeyword)) {
                result.add(s);
            }
        }

        return result;
    }

    public boolean deleteByMssv(String mssv) {
        Student student = findByMssv(mssv);
        if (student != null) {
            students.remove(student);
            return true;
        }
        return false;
    }

    public Student findByMssv(String mssv) {
        for (Student s : students) {
            if (s.getMssv().equalsIgnoreCase(mssv)) {
                return s;
            }
        }
        return null;
    }
}