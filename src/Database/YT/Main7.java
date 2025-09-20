package Database.YT;


import java.sql.*;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/pract";
        String username = "root";
        String password = "123456789";

        // Load MySQL Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Get connection
        Connection conn = DriverManager.getConnection(url, username, password);

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter second name: ");
        String secondName = sc.nextLine();

        // Prepare SQL INSERT query
        String insertQuery = "INSERT INTO Names (first_name, second_name) VALUES (?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(insertQuery);

        // Set values
        pstmt.setString(1, firstName);
        pstmt.setString(2, secondName);

        // Execute the update
        int rowsInserted = pstmt.executeUpdate();

        if (rowsInserted > 0) {
            System.out.println("✅ Data inserted successfully!");
        } else {
            System.out.println("❌ Failed to insert data.");
        }

        // Close connections
        pstmt.close();
        conn.close();
        sc.close();
    }
}
