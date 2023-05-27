package com.JDBCconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//select query demonstration
public class Demo5 {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			PreparedStatement pStatement = connection.prepareStatement("SELECT * FROM employee");
			// Statement statement=pStatement.getResultSet();
			ResultSet resultSet = pStatement.executeQuery();
			
			while (resultSet.next()) { // to check whether there is something in result set or not
				System.out.println("ID >> " + resultSet.getInt(1)); // passing column index here
				System.out.println("UserName >> " + resultSet.getString(2));
				System.out.println("Password >> " + resultSet.getString(3));
			}
			//System.out.println(resultSet.getString(2));
			connection.close();
			pStatement.close();
			resultSet.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
