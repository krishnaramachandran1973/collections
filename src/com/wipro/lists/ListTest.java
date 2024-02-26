package com.wipro.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

import com.wipro.model.Person;

@FunctionalInterface
interface Player {
	// signature
	// function descriptor
	void play(String name);
	// void play(String)
}



class ClassName implements Player {
	@Override
	public void play(String name) {
		System.out.println(name + " is playing");

	}
}

public class ListTest {
	public static void main(String[] args) {
		// Anonymous imple
		Player player = new Player() {			
			@Override
			public void play(String name) {
				System.out.println(name + " is playing");
				
			}
		};
		
		Player player2 = (crap) -> System.out.println(crap +" is playing");
		
	
		
		
		// Create a List and add a few elements
		// backed by an array
		// linkedlist
		// [data |addres ] -> [data | addres] -->  [ | ]     --> [ | ] -> [ | ]
		// [0] [1]  [2] [3] [4]
		// [0] [] [] [0]
		// LinkedList
		List<String> list = new LinkedList<>();

		list.add("John");
		list.add("Richard");
		list.add("Donna");
		list.add("Ken");
		System.out.println("List: " + list);
		int count = list.size();
		System.out.println("Size of List: " + count);
		// Print each element with its index
		for (int i = 0; i < count; i++) {
			String element = list.get(i);
			System.out.printf("list[%d] = %s%n", i, element);
		}
		List<String> subList = list.subList(1, 3);
		System.out.println("Sub List 1(inclusive) to 3(exclusive): " + subList);
		// Remove "Donna" from the list
		list.remove("Donna"); // Same as list.remove(2);
		System.out.println("List after removing Donna: " + list);
		// Create a List using the static factory method of()
		List<String> names = List.of("Li", "Xi", "Bo", "Da", "Fa", "Bo");
		System.out.println("List using List.of() method: " + names);
		
		list.sort(null);
	}

}
