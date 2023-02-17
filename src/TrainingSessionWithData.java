import java.util.Date;
import java.util.List;

public class TrainingSessionWithData {
    private List<TrainingSessionData> trainingSessionData;
    private int idTrainingSession;
    private Date startTime;
    private Date endTime;
    private Session sessionType;
    private String userUsername;


    public TrainingSessionWithData(List<TrainingSessionData> trainingSessionData, int idTrainingSession, Date startTime, Date endTime, Session sessionType, String userUsername, Session session) {
        this.trainingSessionData = trainingSessionData;
        this.idTrainingSession = idTrainingSession;
        this.startTime = startTime;
        this.endTime = endTime;
        this.sessionType = sessionType;
        this.userUsername = userUsername;
    }

    public List<TrainingSessionData> getTrainingSessionData() {
        return trainingSessionData;
    }
    public void setTrainingSessionData(List<TrainingSessionData> trainingSessionData) {
        this.trainingSessionData = trainingSessionData;
    }

    public int getIdTrainingSession() {
        return idTrainingSession;
    }
    public void setIdTrainingSession(int idTrainingSession) {
        this.idTrainingSession = idTrainingSession;
    }
    public Date getStartTime() {
        return startTime;
    }
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    public Date getEndTime() {
        return endTime;
    }
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    public Session getSessionType() {
        return sessionType;
    }
    public void setSessionType(Session sessionType) {
        this.sessionType = sessionType;
    }
    public String getUserUsername() {
        return userUsername;
    }
    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }
    public enum Session {
        CYCLING, RUNNING;
    }
}