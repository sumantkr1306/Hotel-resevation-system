package Hotel_Resevation_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/hotel_db";
        String username = "root";
        String password = "1729";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to MySQL successfully!");
            conn.close();
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}
