import java.sql.*;

public class SQL {

	public static void main(String[] args) {
		String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL = "jdbc:sqlserver://localhost:1433; DatabaseName=***"; 
		//1433 is the default local host and change *** to the name of your database 
		
		String userid = "***";  //change *** to the user name of your database
		String passwd = "***";  //change *** to the pass word of your database
		
		try{
			Class.forName(driverName);
			Connection conn = DriverManager.getConnection(dbURL,userid,passwd);
			Statement stmt = conn.createStatement();
			
			try{
				stmt.executeUpdate("SELECT * FROM table"); // fill in your SQL statement here
				System.out.println("Success!");
			}
			catch(SQLException sqle){
			System.out.println("Could not execute." + sqle);
			}
			
			stmt.close();
			conn.close();
		}
		catch(Exception sqle){
		System.out.println("Exception:" + sqle);
		}
	}
}
