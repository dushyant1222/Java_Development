package com.java.Collections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Testing {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver found");
			
			Connection connection  = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "root");
			System.out.println("Connnection success");
			
			Statement statement = connection.createStatement();
			
			
			ResultSet resultSet = statement.executeQuery("SELECT * FROM college_details");
			System.out.println("The Full DB is here below");
//			while(resultSet.next()) {
//				System.out.println(resultSet.getInt(1)+ " " + resultSet.getString(2) + " " + resultSet.getInt(3));
//			}
			
			int max_sal = Integer.MIN_VALUE;
			while(resultSet.next()) {
				int sal = resultSet.getInt(3);
				
				if(sal > max_sal) {
					max_sal = sal;
				}
			}
			
			System.out.println("The maximum salary in the databse is: "+ max_sal);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
}
