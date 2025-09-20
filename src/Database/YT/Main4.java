package Database.YT;

import java.sql.*;

public class Main4 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/pract";
        String username = "root";
        String password = "123456789";

        System.out.println("Driver loaded Successfully");

        Connection conn = DriverManager.getConnection(url, username, password);

        // Option 1: Using Statement (hardcoded values)
        /*
        Statement stmt = conn.createStatement();
        String query = "UPDATE info SET city = 'Pune' WHERE rollno = 9";
        int rowaffected = stmt.executeUpdate(query);
        stmt.close();
        */

        // Option 2: Using PreparedStatement (recommended)
        String query = "UPDATE info SET city = ? WHERE rollno = ?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, "Odisa");
        pstmt.setInt(2, 9);
        int rowaffected = pstmt.executeUpdate();
        pstmt.close();

        if (rowaffected > 0) {
            System.out.println("Update successful. " + rowaffected + " row(s) affected.");
        } else {
            System.out.println("Update failed.");
        }

        conn.close();
    }
}
