import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecordExample {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "password");

            Statement stmt = con.createStatement();

            String sql = "INSERT INTO Student VALUES (101, 'Kalpana', 19)";

            stmt.executeUpdate(sql);

            System.out.println("Record inserted successfully!");

            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
