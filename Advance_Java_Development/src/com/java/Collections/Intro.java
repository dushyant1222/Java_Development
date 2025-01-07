package com.java.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intro {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(12);
		list.add(22);
		list.add(21);
		System.out.println(list);
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(11);
		set.add(11);
		set.add(13);
		set.add(15);
		System.out.println(set);
	}
}
