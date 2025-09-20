package Exception_Handling.Throwable.Exception.Checked;

import java.sql.DriverManager;
import java.sql.SQLException;
// Checked: SQLException
public class Demo2 {
    public static void main(String[] args) throws SQLException {
        DriverManager.getConnection("axcs");
    }
}
