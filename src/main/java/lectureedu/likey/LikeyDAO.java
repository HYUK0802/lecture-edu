package lectureedu.likey;

import com.hyuk.lectureedu.util.DatabaseUtil;

import java.sql.*;

public class LikeyDAO {

    private Connection conn;

    public LikeyDAO() {
        try {
            String dbURL = "jdbc:mariadb://localhost:3306/LectureEvaluation";
            String dbID = "study";
            String dbPassword = "test1234";
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public int like(String userID, String evaluationID, String userIP) {
        String SQL = "INSERT INTO LIKEY VALUES (?, ?, ?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, userID);
            pstmt.setString(2, evaluationID);
            pstmt.setString(3, userIP);
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1; // 추천 중복 오류
    }
}


