package Database.PreparedStatementExample;

import com.mysql.cj.exceptions.ConnectionIsClosedException;
import com.mysql.cj.exceptions.DataReadException;

import java.sql.*;

public class Demo2 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/pract";
        String username = "root";
        String password = "123456789";
        String sql = "INSERT INTO info(name,rollno,city)values(?,?,?);";


        Connection conn = DriverManager.getConnection(url,username,password);
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,"Rajni");
        pstmt.setInt(2,56);
        pstmt.setString(3,"Madras");

        int affected = pstmt.executeUpdate();

        if(affected>0){
            System.out.println("successfully updated");
        }else{
            System.out.println("unsuccessfully ");
        }
    }
}
