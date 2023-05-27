package com.JDBCconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//delete query using JDBC
public class Demo4 {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			PreparedStatement pStatement = connection.prepareStatement("DELETE from employee WHERE id = ?");
			pStatement.setInt(1, 3);
			int i = pStatement.executeUpdate();
			System.out.println("records updated >> " + i);
			connection.close();
			pStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
