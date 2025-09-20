package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementExample2{
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "123456789";


        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            String sql = "SELECT * FROM mytable WHERE name = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "John"); // Set parameter value

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String resultName = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("ID: " + id + ", Name: " + resultName + ", Age: " + age); // ID: 114, Name: John, Age: 25
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



/*
✅ What are Parameterized SQL Queries?
A parameterized query is a SQL query where input values are replaced with placeholders (?), and you set the actual values later in your Java code.

✅ Example of Parameterized Query:
SELECT * FROM students WHERE email = ? AND password = ?;

The ? symbols are called parameters (placeholders).
You set these values using setString(), setInt(), etc.
*/
