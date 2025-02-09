package com.java.Collections.UserData;

import java.util.HashSet;
import java.util.Set;

public class Data {
	public static void main(String[] args) {
		
		String[] name = new String[3];
		float[] salary = new float[3];
		
		name[0] = "Dushyant"; name[1] = "Dev";name[2] = "BG";
		salary[0] = 123 ; salary[1] = 456; salary[2] = 789;
		
		Set<User> set = new HashSet<User>();
		
		for (int i = 0; i < 3; i++) {
			User user = new User();
			
			user.setId(i+1);
			user.setName(name[i]);
			user.setSalary(salary[i]);
			
			set.add(user);
		}
		
		for(User u: set) {
			System.out.println(u.id + " "+ u.name + " "+ u.salary);
		}
	}

}
