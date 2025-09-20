package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo2 {
    public static void main(String[] args) {

                String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase";
                String username = "root";
                String password = "password";

                Connection conn = null;
                Statement stmt = null;
                ResultSet rs = null;

                try {
                    // Load the JDBC driver
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    // Establish the connection
                    conn = DriverManager.getConnection(jdbcUrl, username, password);

                    // Create a statement
                    stmt = conn.createStatement();

                    // Execute a query
                    rs = stmt.executeQuery("SELECT * FROM mytable");

                    // Process the result set
                    while (rs.next()) {
                        System.out.println("ID: " + rs.getInt("id")); // ID: jhs-cedc
                        System.out.println("Name: " + rs.getString("name")); // name: John
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    // Close resources
                    try {
                        if (rs != null) rs.close();
                        if (stmt != null) stmt.close();
                        if (conn != null) conn.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

