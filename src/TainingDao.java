import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class TainingDao {


    private final String getTraningSessionDataByTrainingId = ""
            + "SELECT ts.* , tsd.* FROM training_session AS ts "
            + "LEFT JOIN training_session_data AS tsd ON ts.ID_TRAINING_SESSION = tsd.TRAINING_SESSION "
            + "WHERE ts.ID_TRAINING_SESSION = ?;";

    public TrainingSessionWithData getTraningSessionDataByTrainingId(Integer trainingId) throws SQLException {

        ResultSet rs = null;
        TrainingSessionWithData newTrainingSessionWithData = null;

        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Larmani97");
            PreparedStatement ps = conn.prepareStatement(getTraningSessionDataByTrainingId)) {
            ps.setInt(1, trainingId);
            rs = ps.executeQuery();


            while (rs.next()) {
                List<TrainingSessionData> trainingSessionData = new ArrayList<>();
                int idTrainingSession = rs.getInt("ID_TRAINING_SESSION");
                Date startTime = rs.getDate("START_TIME");
                Date endTime = rs.getDate("END_TIME");
                String sessionValue = rs.getString("SESSION_TYPE");
                Session session = Session.valueOf(sessionValue);
                String username = rs.getString("USER_USERNAME");
                Long idTrainingSessionDate;
                double latitude = rs.getDouble("LATITUDE");
                double longitude = rs.getDouble("LONGITUDE");
                double movementSpeed = rs.getDouble("MOVEMENT_SPEED");
                double heartRate = rs.getDouble("HEART_RATE");
                int trainingSession = rs.getInt("TRAINING_SESSION");
                //Arrivato qua :/

            }

            return newTrainingSessionWithData;
        }finally {
            if(rs != null) rs.close();
        }
    }

}
