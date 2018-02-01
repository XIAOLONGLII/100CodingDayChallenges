package com.javaliang10th;

import java.util.*;

public class TestHashSet {

	public static void main(String[] args)
	{
		Set<String> set = new HashSet<>();
		set.add("London");
		set.add("Beijing");
		set.add("New York");
		set.add("San Francisco");
		set.add("Paris");
		set.add("New York");
	
		System.out.println(set);
		
		for(String s: set)
		{
			System.out.print(s.toUpperCase() + " ");
		}
	}

	/*
	 * output:
	 * [Beijing, San Francisco, New York, London, Paris]
	 * BEIJING SAN FRANCISCO NEW YORK LONDON PARIS 
	 * 
	 * two New York added, but only one stored. Because set dose not allow duplicates 
	 */
}
