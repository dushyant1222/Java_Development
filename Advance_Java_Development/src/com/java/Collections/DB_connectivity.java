package com.java.Collections;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.*;

public class DB_connectivity {
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Class Found");
		
		Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost/jdbc_check", "root", "root");
		System.out.println("Connection Success");
		
		java.sql.Statement statement = connection.createStatement();
		
		ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1) + " " + resultSet.getDouble(2));
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
