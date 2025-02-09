package com.java.Collections.ASSIGNMENT_COLLECTION_FRAMEWORKS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_List_Implementation_2 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(654);
		list.add(56);
		list.add(89);
		list.add(2221);
		list.add(990);
		System.out.println("The array list is: "+ list);
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(23);
		set.add(21);
		set.add(67887);
		set.add(100);
		set.add(6);
		System.out.println("The Hash set is: "+set);
		
		
	}
}
