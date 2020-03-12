package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String sql = "CREATE TABLE users (user_id INT AUTO_INCREMENT,"
                + " user_name VARCHAR(255),"
                + " user_email VARCHAR(255) UNIQUE, "
                + " PRIMARY KEY(user_id))";
        String dropTable = "DROP TABLE users";

        Scanner scan = new Scanner(System.in);

        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testing?useSSL=false&characterEncoding=utf8",
                "user", "1369")) {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            scan.nextLine();
            statement.executeUpdate(dropTable);



        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
