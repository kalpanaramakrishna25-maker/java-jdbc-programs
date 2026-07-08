import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementExample {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "password");

            String sql = "INSERT INTO Student(id, name, age) VALUES (?, ?, ?)";

            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setInt(1, 102);
            pstmt.setString(2, "Kalpana");
            pstmt.setInt(3, 19);

            pstmt.executeUpdate();

            System.out.println("Record inserted successfully!");

            pstmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
