package com.cmc.chapter05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Bai1 {

    public static void main(String[] args) {

        // 1️⃣ Thông tin kết nối
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "Thuong2006@";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Ket noi thanh cong!");

            Statement stmt = conn.createStatement();

            String sql = "SELECT * FROM users";
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Danh sach nguoi dung:");

            while (rs.next()) {

                int id = rs.getInt("id");
                String usernameDB = rs.getString("username");
                String email = rs.getString("email");

                System.out.println(id + " - " + usernameDB + " - " + email);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}