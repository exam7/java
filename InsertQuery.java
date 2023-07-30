import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class InsertQuery {
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

            String query = "insert into table1(tName, tCity) values (?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, "harshil");
            preparedStatement.setString(2, "vapi-daman");

            System.out.println("inserted successfully");

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
