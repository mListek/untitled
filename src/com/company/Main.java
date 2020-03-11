package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testing?useSSL=false&characterEncoding=utf8",
                "user", "1369")) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
