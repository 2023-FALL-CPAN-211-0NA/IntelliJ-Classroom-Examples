package org.humber.dsa.week12;

import java.sql.*;

public class SelectExample {

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

            // Execute a query to get all records from the table (replace "your_table" with the actual table name)
            String query = "SELECT * FROM STUDENT";
            ResultSet resultSet = statement.executeQuery(query);

            // Process the result set
            while (resultSet.next()) {
                // Retrieve data from the result set
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Date dob = resultSet.getDate("dob");
                // Add more fields as needed

                // Print or process the retrieved data
                System.out.println("ID: " + id + ", Name: " + name + ", DOB: " + dob);
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
