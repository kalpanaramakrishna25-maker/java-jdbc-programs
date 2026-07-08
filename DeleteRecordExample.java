import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecordExample {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "password");

            Statement stmt = con.createStatement();

            String sql = "DELETE FROM Student WHERE id = 101";

            int rows = stmt.executeUpdate(sql);

            System.out.println(rows + " record deleted successfully!");

            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
