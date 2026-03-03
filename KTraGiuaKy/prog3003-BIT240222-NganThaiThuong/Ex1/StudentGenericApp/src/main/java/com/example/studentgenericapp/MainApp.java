package com.example.studentgenericapp;

import com.example.studentgenericapp.manager.StudentManager;
import com.example.studentgenericapp.model.Student;
import java.util.List;
import java.util.stream.Collectors;


public class MainApp {

    public static void main(String[] args) {

        StudentManager<Student> manager = new StudentManager<>();

        manager.add(new Student("S01", "Nguyen Van A", 3.5));
        manager.add(new Student("S02", "Tran Thi B", 3.8));
        manager.add(new Student("S03", "Le Van C", 2.9));

        System.out.println("Danh sach sinh vien:");
        for (Student s : manager.getAll()) {
            System.out.println(s);
        }
    }
    
}
