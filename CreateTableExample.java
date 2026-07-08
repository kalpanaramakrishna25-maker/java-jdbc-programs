import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableExample {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "password");

            Statement stmt = con.createStatement();

            String sql = "CREATE TABLE Student (" +
                         "id INT PRIMARY KEY, " +
                         "name VARCHAR(50), " +
                         "age INT)";

            stmt.executeUpdate(sql);

            System.out.println("Table created successfully!");

            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
