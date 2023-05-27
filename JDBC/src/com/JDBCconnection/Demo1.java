package com.JDBCconnection;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo1 {
	
	
	public static void main(String[] args) throws SQLException  {
		
		
		//writing sql query
		String string = "INSERT INTO user(LastName,FirstName,Address,City) VALUES ('aadesh','more','kharadi','pune')";
		String string2 = "INSERT INTO user(LastName,FirstName,Address,City) VALUES ('amol','bothe','valki','nagar')";
		
		try {
			
			//Loading driver class
			Class.forName("com.mysql.jdbc.Driver");
			
			//create connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			
			//create statement
			Statement statement = connection.createStatement();
			
			//execute statement
			statement.execute(string);
			statement.execute(string2);
			
			System.out.println("insertion completed");
			
			connection.close();
			statement.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//
		
	}

}
