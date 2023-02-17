public class Device {
    private String devicePartNumber;
    private String deviceManufacturer;
    private String deviceModel;
    private short deviceHasGps;
    private short deviceHasHeartRate;
    private String username;

    public Device(String devicePartNumber, String deviceManufacturer, String deviceModel, short deviceHasGps, short deviceHasHeartRate, String username) {
        this.devicePartNumber = devicePartNumber;
        this.deviceManufacturer = deviceManufacturer;
        this.deviceModel = deviceModel;
        this.deviceHasGps = deviceHasGps;
        this.deviceHasHeartRate = deviceHasHeartRate;
        this.username = username;
    }

    public String getDevicePartNumber() {
        return devicePartNumber;
    }
    public void setDevicePartNumber(String devicePartNumber) {
        this.devicePartNumber = devicePartNumber;
    }
    public String getDeviceManufacturer() {
        return deviceManufacturer;
    }
    public void setDeviceManufacturer(String deviceManufacturer) {
        this.deviceManufacturer = deviceManufacturer;
    }
    public String getDeviceModel() {
        return deviceModel;
    }
    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }
    public short getDeviceHasGps() {
        return deviceHasGps;
    }
    public void setDeviceHasGps(short deviceHasGps) {
        this.deviceHasGps = deviceHasGps;
    }
    public short getDeviceHasHeartRate() {
        return deviceHasHeartRate;
    }
    public void setDeviceHasHeartRate(short deviceHasHeartRate) {
        this.deviceHasHeartRate = deviceHasHeartRate;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Device{" +
                "devicePartNumber='" + devicePartNumber + '\'' +
                ", deviceManufacturer='" + deviceManufacturer + '\'' +
                ", deviceModel='" + deviceModel + '\'' +
                ", deviceHasGps=" + deviceHasGps +
                ", deviceHasHeartRate=" + deviceHasHeartRate +
                ", username='" + username + '\'' +
                '}';
    }
}
