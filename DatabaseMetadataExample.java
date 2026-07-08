import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class DatabaseMetadataExample {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "password");

            DatabaseMetaData db = con.getMetaData();

            System.out.println("Database Name: " + db.getDatabaseProductName());
            System.out.println("Database Version: " + db.getDatabaseProductVersion());
            System.out.println("Driver Name: " + db.getDriverName());

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
