// Java program to update a table using PreparedStatement

import java.sql.*;

public class GFG {

	// Driver Code
	public static void main(String[] args) throws Exception
	{

		// Register Driver Class
		Class.forName("org.apache.derby.jdbc.ClientDriver");

		// Connection to your database
		Connection con = DriverManager.getConnection();

		// Query which needs parameters
		String query = "insert into Students values(?,?)";

		// Prepare Statement
		PreparedStatement myStmt
			= con.prepareStatement(query);

		// Set Parameters
		myStmt.setInt(1, 21);
		myStmt.setString(2, 'Prajjwal');

		// Execute SQL query
		int res = myStmt.executeUpdate();

		// Display the records inserted
		System.out.println(res + " records inserted");

		// Close the connection
		con.close();
	}
}
