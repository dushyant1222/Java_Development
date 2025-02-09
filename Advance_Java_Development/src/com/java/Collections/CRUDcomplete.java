package com.java.Collections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CRUDcomplete {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/be", "root", "root");
			System.out.println("Connection Success");
			Statement statement = connection.createStatement();
			Scanner in = new Scanner(System.in);
			System.out.println("Enter your name & Salary");
			//statement.executeUpdate("INSERT INTO employee(name & salary) VALUES("+in.next()+", "+in.nextFloat()+")");
			
			ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getFloat(3));
				
			}
			
			System.out.println("Enter your id and salary to update");
			int i = 0;
			String query = "UPDATE employee SET salary = "+in.nextFloat()+" WHERE (id = "+in.nextInt()+")";
			 i =statement.executeUpdate(query);
			 System.out.println(i);
			 ResultSet resultSet2 = statement.executeQuery("SELECT * FROM employee");
			 while(resultSet2.next()) {
				 System.out.println(resultSet2.getInt(1) + " " + resultSet2.getString(2) + " " + resultSet2.getFloat(3));
			 }
			System.out.println("Enter the ID you want to delete");
			String querydel = "DELETE FROM employee WHERE (id = "+in.nextInt()+")";
			i = statement.executeUpdate(querydel);
			System.out.println(i);
			ResultSet resultSet3 = statement.executeQuery("SELECT * FROM employee");
			while(resultSet3.next()) {
				System.out.println(resultSet3.getInt(1) + " " + resultSet3.getString(2) + " " + resultSet3.getFloat(3));
			}
			
			
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
