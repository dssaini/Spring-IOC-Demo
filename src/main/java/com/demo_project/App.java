package com.demo_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:Mysql://localhost:3306/";
        String user = "root";
        String password = "root";
        try {
            Connection Con = DriverManager.getConnection(url, user, password);
            try {
                Statement stmt = Con.createStatement();
                stmt.executeUpdate(Queries.CreateDb);
                System.out.println("Db created successfully");
            } catch (SQLException e) {
                System.out.println("I am in second Try catch Here is some issur in query or anywhere");
                System.out.println(e.getMessage());
            }finally{
                System.out.println("Closing the connection.");
                Con.close();
                System.out.println("Connection closed.");
            }
        } catch (Exception e) {
            System.out.println("I am in first Try catch");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Connection Couldn't stablished. Please try again later. :(");
        }

    }
}
