package Database.YT;
import java.sql.*;

//The below code show us how to fetch the data from database

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/pract";
        String username = "root";
        String password = "123456789";

//  The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
//  Class.forName("com.mysql.jdbc.Driver");

        System.out.println("Driver loaded successfully");

        Connection conn = DriverManager.getConnection(url,username,password);

        Statement stmt = conn.createStatement();
        String query = "Select*from info;";
        ResultSet rs = stmt.executeQuery(query);

        while(rs.next()){
            String name = rs.getString("name");
            int rollno = rs.getInt("rollno");
            String city = rs.getString("city");

            //printing
            System.out.println(name);
            System.out.println(rollno);
            System.out.println(city);
        }
        conn.close();
        stmt.close();
        rs.close();
        System.out.println();
        System.out.println("Connection Closed Successfully ");
    }
}
