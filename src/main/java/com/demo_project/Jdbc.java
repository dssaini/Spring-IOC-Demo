package com.demo_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class Jdbc {
    // ApplicationContext con = new ClasspathXmlApplocationContext();
    public static void main(String[] args) throws Exception {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        JdbcTemplate  Jdbc = (JdbcTemplate)context.getBean("jdbcTemplate");
        Jdbc.execute(Queries.CreateDb);
        context.close();
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
