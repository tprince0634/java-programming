package Database.YT;

import java.sql.*;

// How to delete the data using Statement and PreparedStatement

public class Main3 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/pract";
        String username = "root";
        String password = "123456789";

        System.out.println("Driver loaded Successfully");

        Connection conn = DriverManager.getConnection(url, username, password);

        // ✅ Option 1: Using Statement (uncomment to use this instead of PreparedStatement)
        /*
        Statement stmt = conn.createStatement();
        String query = "DELETE FROM info WHERE rollno = 57;";
        int rowaffected = stmt.executeUpdate(query);
        stmt.close();
        */

        // ✅ Option 2: Using PreparedStatement (recommended)
        String query = "DELETE FROM info WHERE rollno = ?;";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setInt(1, 57);
        int rowaffected = pstmt.executeUpdate();
        pstmt.close();

        if (rowaffected > 0) {
            System.out.println("Deleted successfully. " + rowaffected + " row(s) affected.");
        } else {
            System.out.println("Deletion failed. No matching record found.");
        }

        conn.close();
    }
}
