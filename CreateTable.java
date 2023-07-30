import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class CreateTable{
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
            
            String query = "create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";

            Statement statement = connection.createStatement();

            statement.executeUpdate(query);

            System.out.println("table created successfully");

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    } 
}
