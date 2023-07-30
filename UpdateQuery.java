import java.sql.*;

public class UpdateQuery {
    public static void main(String[] args) {
        String databaseUrl = "jdbc:mysql://localhost:3306/javadb";
        String username = "root";
        String password = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(databaseUrl, username, password);

            String query = "UPDATE table1 SET tName = ?, tCity = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            System.out.println("Employee updated successfully!");

            connection = DriverManager.getConnection(databaseUrl, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


