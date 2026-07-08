import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionManagementExample {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "password");

            con.setAutoCommit(false);

            Statement stmt = con.createStatement();

            stmt.executeUpdate("INSERT INTO Student VALUES (106, 'Anu', 20)");
            stmt.executeUpdate("INSERT INTO Student VALUES (107, 'Ravi', 21)");

            con.commit();

            System.out.println("Transaction completed successfully!");

            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
