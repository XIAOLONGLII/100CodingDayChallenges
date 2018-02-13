package com.javaliang10th.linkedHashSet;

import java.util.*;

public class TestLinkedHashSet {

	public static void main(String[] args)
	{
		Set<String> set = new LinkedHashSet<>();
		set.add("London");
		set.add("Beijing");
		set.add("New York");
		set.add("San Francisco");
		set.add("Paris");
		System.out.println(set);
		
		for(String element: set)
			System.out.print(element.toLowerCase() + " ");

	}

}
