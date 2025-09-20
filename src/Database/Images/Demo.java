package Database.Images;

import java.sql.*;

public class Demo {
    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "password";


        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }

        try{
            conn = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connection Established Successfully");
        }catch (SQLException e){
            System.out.println(e);
        }

    }
}
