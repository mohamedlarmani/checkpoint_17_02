public class TrainingSessionData {
    private Long idTrainingSessionDate;
    private double latitude;
    private double longitude;
    private double movementSpeed;
    private double heartRate;
    private int trainingSession;
    public Long getIdTrainingSessionDate() {
        return idTrainingSessionDate;
    }
    public void setIdTrainingSessionDate(Long idTrainingSessionDate) {
        this.idTrainingSessionDate = idTrainingSessionDate;
    }
    public double getLatitude() {
        return latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public double getMovementSpeed() {
        return movementSpeed;
    }
    public void setMovementSpeed(double movementSpeed) {
        this.movementSpeed = movementSpeed;
    }
    public double getHeartRate() {
        return heartRate;
    }
    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }
    public int getTrainingSession() {
        return trainingSession;
    }
    public void setTrainingSession(int trainingSession) {
        this.trainingSession = trainingSession;
    }
}
