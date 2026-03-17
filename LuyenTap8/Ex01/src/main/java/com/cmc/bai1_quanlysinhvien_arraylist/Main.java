package com.cmc.bai1_quanlysinhvien_arraylist;

import com.cmc.bai1_quanlysinhvien_arraylist.model.Student;
import com.cmc.bai1_quanlysinhvien_arraylist.service.StudentManager;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final StudentManager manager = new StudentManager();

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            choice = inputInt("Chon chuc nang: ");

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> manager.displayAllStudents();
                case 3 -> searchStudentByName();
                case 4 -> deleteStudentByMssv();
                case 0 -> System.out.println("Thoat chuong trinh.");
                default -> System.out.println("Lua chon khong hop le.");
            }

            System.out.println();
        } while (choice != 0);
    }

    private static void showMenu() {
        System.out.println("========= QUAN LY SINH VIEN =========");
        System.out.println("1. Them sinh vien");
        System.out.println("2. Hien thi danh sach sinh vien");
        System.out.println("3. Tim sinh vien theo ten");
        System.out.println("4. Xoa sinh vien theo MSSV");
        System.out.println("0. Thoat");
    }

    private static void addStudent() {
        System.out.println("----- THEM SINH VIEN -----");
        System.out.print("Nhap MSSV: ");
        String mssv = scanner.nextLine().trim();

        System.out.print("Nhap ten: ");
        String ten = scanner.nextLine().trim();

        double gpa = inputDouble("Nhap GPA: ");

        Student student = new Student(mssv, ten, gpa);

        if (manager.addStudent(student)) {
            System.out.println("Them sinh vien thanh cong.");
        } else {
            System.out.println("Them that bai. Ma sinh vien bi trung hoac du lieu khong hop le.");
        }
    }

    private static void searchStudentByName() {
        System.out.println("----- TIM SINH VIEN THEO TEN -----");
        System.out.print("Nhap ten can tim: ");
        String keyword = scanner.nextLine().trim();

        List<Student> result = manager.searchByName(keyword);

        if (result.isEmpty()) {
            System.out.println("Khong tim thay sinh vien nao.");
        } else {
            System.out.println("Ket qua tim kiem:");
            for (Student s : result) {
                System.out.println(s);
            }
        }
    }

    private static void deleteStudentByMssv() {
        System.out.println("----- XOA SINH VIEN -----");
        System.out.print("Nhap MSSV can xoa: ");
        String mssv = scanner.nextLine().trim();

        if (manager.deleteByMssv(mssv)) {
            System.out.println("Xoa sinh vien thanh cong.");
        } else {
            System.out.println("Khong tim thay MSSV can xoa.");
        }
    }

    private static int inputInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so nguyen hop le.");
            }
        }
    }

    private static double inputDouble(String message) {
        while (true) {
            try {
                System.out.print(message);
                double value = Double.parseDouble(scanner.nextLine().trim());

                if (value < 0 || value > 4.0) {
                    System.out.println("GPA phai tu 0 den 4.0.");
                    continue;
                }

                return value;
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so thuc hop le.");
            }
        }
    }
}
