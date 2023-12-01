package org.humber.dsa.week12;

import java.sql.*;

public class InsertDataExample {

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

            // Create a prepared statement for the insert query
            String insertQuery = "INSERT INTO STUDENT (id, name, dob) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            // Set values for the parameters in the insert query
            preparedStatement.setInt(1, 101); // id
            preparedStatement.setString(2, "Steve"); // name
            preparedStatement.setDate(3, Date.valueOf("2001-01-01")); // dob

            // Execute the insert query
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Insertion successful. Rows affected: " + rowsAffected);
            } else {
                System.out.println("Insertion failed.");
            }

            // Close resources
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
