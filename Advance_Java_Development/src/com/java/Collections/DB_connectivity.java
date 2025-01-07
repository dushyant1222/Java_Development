package com.java.Collections;
import java.util.*;

public class DB_connectivity {
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Class Found");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
