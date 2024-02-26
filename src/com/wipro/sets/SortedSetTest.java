package com.wipro.sets;

import static java.util.Comparator.comparing;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.wipro.model.Person;

public class SortedSetTest {
	public static void main(String[] args) {
		// Create a sorted set of some names
		SortedSet<String> sortedNames = new TreeSet<>();
		sortedNames.add("John");
		sortedNames.add("Adam");
		sortedNames.add("Eve");
		sortedNames.add("Donna");
		sortedNames.forEach(name -> System.out.println(name));

		Set<Person> persons = new TreeSet<>(comparing(Person::getName));
		
		persons.add(new Person(2, "Donna"));
		persons.add(new Person(3, "Eve"));
		persons.add(new Person(1, "John"));

		for (Person person : persons) {
			System.out.println(person);
		}
		// persons.forEach(person -> System.out.println(person));
	}

}
