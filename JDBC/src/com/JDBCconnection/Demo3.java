package com.JDBCconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


//update query usage using JDBC
public class Demo3 {

	public static void main(String[] args) {
	
		//String string = "UPDATE EMPLOYEE SET username = 'shyampatil' WHERE id ='3'";
		try {
		
			//loading the driver class
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			//PreparedStatement pStatement=connection.prepareStatement("UPDATE employee SET username = ? WHERE id = ?");
			PreparedStatement pStatement=connection.prepareStatement("UPDATE employee SET username = ?,password = ? WHERE id = ?");
			
			
			pStatement.setString(1, "amolbothe");
			pStatement.setString(2, "pandit@1209");
			pStatement.setString(3, "1");
			int i = pStatement.executeUpdate();
			System.out.println("Records updated >> "+i);
			connection.close();
			pStatement.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
}
