package jm.task.core.jdbc.util;
import java.sql.*;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/preproek";
    private static final String USERNAME = "root";
    private static  final String PASSWORD = "root";
    public static Connection openConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch ( SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
