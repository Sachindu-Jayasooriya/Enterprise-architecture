import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/employee_db"; // Database URL
    private static final String USER = "root"; // Your MySQL username
    private static final String PASSWORD = ""; // Your MySQL password

    public static Connection getConnection() throws SQLException {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Return the database connection
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
            throw new SQLException("Failed to establish connection.");
        }
    }

    public static void main(String[] args) {
        // Testing the connection
        try {
            // Try to get the database connection
            Connection conn = getConnection();
            
            if (conn != null) {
                System.out.println("Connection established successfully!");
                conn.close();  // Close the connection after testing
            }
        } catch (SQLException e) {
            // Handle any SQL exceptions
            System.out.println("Error occurred while establishing the connection: " + e.getMessage());
        }
    }
}
