import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DeviceDao {

    private final String getAllDeviceWIthHearthRateAndGps = "SELECT * FROM DEVICE WHERE DEVICE_HAS_GPS <> 0 AND DEVICE_HAS_HEARTRATE <> 0 AND USERNAME = ?;";

    public List<Device> getAllDeviceWIthHearthRateAndGps(String user) throws SQLException {
        List deviceWIthHearthRateAndGpsList = new ArrayList();
        ResultSet rs = null;
        
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Larmani97");
        PreparedStatement ps = conn.prepareStatement(getAllDeviceWIthHearthRateAndGps)){
            ps.setString(1,user);
            rs = ps.executeQuery();

            while(rs.next()){
                String devicePartNumber = rs.getString("DEVICE_PART_NUMBER");
                String deviceManufacturer = rs.getString("DEVICE_MANUFACTURER");
                String deviceModel = rs.getString("DEVICE_MODEL");
                short deviceHasGps = rs.getShort("DEVICE_HAS_GPS");
                short deviceHasHeartRate = rs.getShort("DEVICE_HAS_HEARTRATE");
                String username = rs.getString("USERNAME");

                Device newDevice = new Device(devicePartNumber, deviceManufacturer, deviceModel, deviceHasGps, deviceHasHeartRate, username);
                deviceWIthHearthRateAndGpsList.add(newDevice);
            }

            return deviceWIthHearthRateAndGpsList;
        }finally {
            if(rs != null) rs.close();
        }
    }

}
