import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchProcessingExample {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "password");

            Statement stmt = con.createStatement();

            stmt.addBatch("INSERT INTO Student VALUES (103, 'Rahul', 20)");
            stmt.addBatch("INSERT INTO Student VALUES (104, 'Neha', 21)");
            stmt.addBatch("INSERT INTO Student VALUES (105, 'Sofia', 19)");

            stmt.executeBatch();

            System.out.println("Batch executed successfully!");

            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
