package Database.PreparedStatementExample;

import java.sql.*;

public class Demo {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/pract";
        String username = "root";
        String password = "123456789";
        String sql = "SELECT *FROM info WHERE name = ?";

        Connection conn  = DriverManager.getConnection(url,username,password);
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,"prince");

        ResultSet rs = pstmt.executeQuery();

        while(rs.next()){
            int rollno = rs.getInt("rollno");
            String city = rs.getString("city");

            System.out.println("Roll No:" + rollno +  " " + "City:" + city);
        }

    }

}
