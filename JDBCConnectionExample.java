import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnectionExample {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "password");

            System.out.println("Database Connected Successfully!");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
