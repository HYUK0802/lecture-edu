package lectureedu.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {

    public static Connection getConnection() {
        try {
            String dbURL = "jdbc:mariadb://localhost:3306/LectureEvaluation";
            String dbID = "study";
            String dbPassword = "test1234";
            Class.forName("org.mariadb.jdbc.Driver");
            return DriverManager.getConnection(dbURL,dbID,dbPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
