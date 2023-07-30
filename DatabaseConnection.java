import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection{
    public static void main(String[] args) {
        String databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "1234";

        try {
            Class.forName("com.mysql.jdbc.Driver"); 

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(databaseUrl, username, password);
            System.out.println("connection estlablish");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } 
}
