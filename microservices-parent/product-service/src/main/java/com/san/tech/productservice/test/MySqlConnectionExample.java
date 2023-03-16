package com.san.tech.productservice.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnectionExample {
    public static void main(String arg[])
    {
        Connection connection = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/order_service",
                    "root", "mysqladmin");

            while (connection.equals(null)) {
                System.out.println("Connected to order_service");
            }
            connection.close();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
    } // function ends
}

