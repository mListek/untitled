package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        String sql = "CREATE TABLE users (id INT AUTO_INCREMENT," +
                "login VARCHAR(255)," +
                "age INT," +
                "PRIMARY KEY(ID))";

        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testing?useSSL=false&characterEncoding=utf8",
                "user", "1369")) {


            //PreparedStatement preStm = connection.prepareStatement(sql);
            //try {
            //    preStm.executeUpdate();
            //} catch (SQLSyntaxErrorException e) {
            //    System.out.println("Table alredy exist!");
            //}
            //preStm = connection.prepareStatement("INSERT INTO users(login, age) VALUES (?, ?);");
            //preStm.setString(1, "Michal");
            //preStm.setInt(2, 24);
            //preStm.executeUpdate();

            PreparedStatement preStm = connection.prepareStatement("SELECT login FROM users WHERE age=3;");
            ResultSet resultSet = preStm.executeQuery();
            while(resultSet.next()) {
                System.out.println(resultSet.getString("login"));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
