package org.humber.dsa.week12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableExample {

    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String jdbcUrl = "jdbc:mysql://localhost:8889/DS_ALGO";
        String username = "root";
        String password = "root";

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Create a statement
            Statement statement = connection.createStatement();

            // dropping the table if exists
            statement.execute("DROP TABLE IF EXISTS STUDENT");

            // Create the STUDENT table
            String createTableQuery = "CREATE TABLE STUDENT (" +
                    "id INT PRIMARY KEY, " +
                    "name VARCHAR(100), " +
                    "dob DATE" +
                    ")";
            statement.executeUpdate(createTableQuery);

            System.out.println("Table STUDENT created successfully.");

            // Close resources
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
