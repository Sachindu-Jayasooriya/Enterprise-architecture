import java.sql.*;

public class jdbc {
    public static void main(String[] args) {
        // Define database connection parameters
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "";

        // Declare JDBC objects
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Step 1: Load the JDBC driver (not needed in newer versions of MySQL JDBC driver)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish a connection to the database
            conn = DriverManager.getConnection(url, username, password);

            // Step 3: Create a statement object
            stmt = conn.createStatement();

            // Step 4: Execute a query
            String query = "SELECT * FROM employees";
            rs = stmt.executeQuery(query);

            // Step 5: Process the results
            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println(name + " - " + age);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // Step 6: Close resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
