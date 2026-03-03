package com.example.ex3;

import com.example.ex3.model.Student;
import java.util.*;
import java.util.stream.*;

public class MainApp {

    public static void main(String[] args) {
        List<Student> student = Arrays.asList(
            new Student("S04", "Nguyen Van D", 3.6),
            new Student("S05", "Tran Thi E", 3.4),
            new Student("S06", "Le Van F", 2.8)
        );
        System.out.println("Sinh vien co Gpa tren 3.2 la:");
        List<String> result = student.stream()
                .filter(e -> e.getGpa() > 3.2)
                .map(Student::getName)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
    
}
