package com.san.tech.orderservice.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnectionExample {
    public static void main(String arg[]) {
        Connection connection;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306",
                    "root", "mysqladmin");

            if (!connection.equals(null)) {
                System.out.println("Connected to the mysql database");
                connection.close();
            } else {
                System.out.println("Failed to connect mysql database");
            }
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}

