package Database;

import java.sql.*;

public class Demo {
    public static void main(String[] args) throws SQLException {

        // Establish a Connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");

        // Create a Statement: Create a statement to execute SQL queries.
        Statement stmt = conn.createStatement();

        // Execute Queries: Execute SQL queries and retrieve results.
        ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");
        while (rs.next()) {
            System.out.println("Column Value: " + rs.getString("columnname"));
        }

// Close Connections: Close the connection and other resources to free up database resources.
        rs.close();
        stmt.close();
        conn.close();
    }
}


/*✅ What Happens Here Step-by-Step:

1. while (rs.next()):
ResultSet (rs) contains all rows returned by the SQL query.
.next() moves the cursor to the next row of the result set.
It returns true if there is a next row; otherwise, it returns false (ends loop).
✅ Purpose: Loop through every row in the result set, one by one.


2. rs.getString("columnname"):
Retrieves the value of the column named "columnname" in the current row.
You can use different methods depending on column type:
rs.getString() → for text.
rs.getInt(), rs.getDouble(), etc., → for numbers.
✅ Purpose: Extract data from each row.


3. System.out.println():
Prints the column value to the console/output.
✅ Purpose: Display the fetched data row by row.
*/