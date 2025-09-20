package Database.YT;

import java.awt.dnd.DragGestureEvent;
import java.sql.*;

//How to Insert the data

public class Main2 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/pract";
        String username = "root";
        String password = "123456789";

        System.out.println("Driver load successfully");

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();

            String query = "Insert into info(name,rollno,city)values('Harshit',57,'Delhi');";
            int rowaffected = stmt.executeUpdate(query);

            if (rowaffected > 0) {
                System.out.println("Insert successfull " + rowaffected + "rows affected ");
            } else {
                System.out.println("Insertion Failed");
            }

            conn.close();
            stmt.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
