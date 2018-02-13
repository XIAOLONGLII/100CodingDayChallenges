package com.javaliang10th;

import java.util.*;

public class TestMethodInCollection {

	public static void main(String[] args)
	{
		Set<String> set = new HashSet<>();
		set.add("London");
		set.add("Beijing");
		set.add("New York");
		set.add("San Francisco");
		set.add("Paris");
		
		System.out.println("set is " + set);
		System.out.println(set.size() + " elements in set");
		
		//remove a string from set
		set.remove("London");
		System.out.println("set is " + set);
		System.out.println(set.size() + " elements in set");
		
		Set<String> set1 = new HashSet<>();
		set1.add("10");
		set1.add("100");
		set1.add("1000");
		set1.add("10000");
		set1.add("100000");
		set1.add("100000");
		set1.add("100000");

		System.out.println("set1 is " + set1);
		System.out.println(set1.size() + " elements in set1");
		
		//insert
		set1.add("11");
		set1.add("101");
		set1.add("1001");
		System.out.println("set1 is " + set1);
		System.out.println(set1.size() + " elements in set1");
		
		set1.addAll(set);

		System.out.println("set is " + set1);
		System.out.println(set1.size() + " elements in set");
		
		set1.removeAll(set);
		System.out.println("set is " + set1);
		System.out.println(set1.size() + " elements in set");
		
		set1.retainAll(set);
		System.out.println("set is " + set1);
		System.out.println(set1.size() + " elements in set");
		
		
	}

}
