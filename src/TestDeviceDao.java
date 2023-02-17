import java.sql.SQLException;

public class TestDeviceDao {
    public static void main(String[] args) throws SQLException {

        DeviceDao deviceDao = new DeviceDao();
        deviceDao.getAllDeviceWIthHearthRateAndGps("paolo").forEach(device -> System.out.println(device));

    }
}