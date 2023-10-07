package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
    public class DBconnection {
        public static Connection getDbConnection() throws SQLException {
            Connection conn = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
            return conn;
        }
    }
