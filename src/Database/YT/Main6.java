package Database.YT;

import java.sql.*;

public class Main6 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/pract";
        String username = "root";
        String password = "123456789";

        // Load MySQL Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Get connection
        Connection conn = DriverManager.getConnection(url, username, password);

        // Select data from table
        String query2 = "SELECT * FROM Names";

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query2);

        System.out.println("Fetched data from table:");

        while (rs.next()) {
            String firstName = rs.getString("first_name");
            String secondName = rs.getString("second_name");
            System.out.println(firstName + " " + secondName);
        }

        conn.close();
    }
}
