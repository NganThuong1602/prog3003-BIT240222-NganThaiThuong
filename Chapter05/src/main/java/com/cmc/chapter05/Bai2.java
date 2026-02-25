package com.cmc.chapter05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Bai2 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "Thuong2006@";

        int idToDelete = 2;

        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            String sql = "DELETE FROM users WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, idToDelete);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Xoa user thanh cong");
            } else {
                System.out.println("Khong tim thay user de xoa");
            }

            pstmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
