package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionSample {

	public static void main(String args[]) {

//		// Creating ArrayList Object
//		List<Integer> al = new ArrayList<Integer>();
//
//		// Adding elements to the ArrayList
//		al.add(10);
//		al.add(45);
//		al.add(55);
//		al.add(23);
//		al.add(32);
//
//		//System.out.println(al);// printing list
//
//		//System.out.println(al.get(0)); // print first value
//
//		al.set(0, 11); // replace using set
//
//		//System.out.println(al);
//
//		al.remove(0); // remove
//
//		//System.out.println(al);
//
//		ArrayList<String> animals = new ArrayList<>(Arrays.asList("Cat", "Cow", "Dog"));
//		//System.out.println("ArrayList: " + animals);
//
//		ArrayList<String> mammals = new ArrayList<>();
//		mammals.add("Dog");
//		mammals.add("Cat");
//		mammals.add("Horse");
//		//System.out.println("Mammals: " + mammals);
//
//		animals.add("Crocodile");
//
//		// Add all elements of mammals in animals
//		animals.addAll(mammals);
//		//System.out.println("Animals: " + animals);
//
//		animals.clear();
//
//		//System.out.println(animals); // remove all
//
//		// max() method of Collections class
//		 System.out.println("Maximum element in the given list : " +
//		 Collections.max(al));
//		 Collections.sort(al);

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//		Set<Integer> set1 = new HashSet<>();
//
//		// Add elements to the set1
//		set1.add(2);
//		set1.add(3);
//		System.out.println("Set1: " + set1);
//
//		// Creating another set using the HashSet class
//		Set<Integer> set2 = new HashSet<>();
//
//		// Add elements
//		set2.add(1);
//		set2.add(2);
//		System.out.println("Set2: " + set2);
//
//		// Union of two sets
//		set2.addAll(set1);
//		System.out.println("Union is: " + set2);
//
//		boolean value1 = set2.remove(5);
//		System.out.println("Is 5 removed? " + value1);
//
//		boolean value2 = set2.removeAll(set2);
//		System.out.println("Are all elements removed? " + value2);
//
//		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
		Map<String, Integer> numbers = new HashMap<>();

		// Insert elements to the map
		numbers.put("One", 1);
		numbers.put("Two", 2);
		System.out.println("Map: " + numbers);

		// Using get()
		int mapValue = numbers.get("One");
		System.out.println("Returned Number: " + mapValue);

		// Access keys of the map
		System.out.println("Keys: " + numbers.keySet());

		// Access values of the map
		System.out.println("Values: " + numbers.values());

		// Access entries of the map
		System.out.println("Key/Value mappings: " + numbers.entrySet());

		// Remove Elements from the map
		int value = numbers.remove("Two");
		System.out.println("Removed Value: " + value);

		// replace
		numbers.replace("One", 22);
		System.out.println("HashMap using replace(): " + numbers);

		numbers.replace("One", 22, 33);
		System.out.println("HashMap using replace(): " + numbers);

	}
}
