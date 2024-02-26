package com.wipro.maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.wipro.model.Person;

public class MapTest {
	public static void main(String[] args) {
		// Create a map and add some key-value pairs
		// WeakHashMap
		Map<String, String> map = new HashMap<>();
		map.put("John", "(342)113-9878");
		map.put("Richard", "(245)890-9045");
		map.put("Donna", "(205)678-9823");
		map.put("Ken", "(205)678-9823");
		// Print the details
		printDetails(map);
		// Remove all entries from the map
		map.clear();

		System.out.printf("%nRemoved all entries from the map.%n%n");
		// Print the details
		printDetails(map);
		
		Map<String, List<Person>> persons = new HashMap<>();
		// unmodifiable -- immutable
		Map<String, List<Person>> unmodifiableMap = Collections.unmodifiableMap(persons);
		
		Map.of("name","Krishna");
		
	}

	public static void printDetails(Map<String, String> map) {
		// Get the value for the "Donna" key
		String donnaPhone = map.get("Donna");

		// Print details
		System.out.println("Map: " + map);
		System.out.println("Map Size: " + map.size());
		System.out.println("Map is empty: " + map.isEmpty());
		System.out.println("Map contains Donna key: " + map.containsKey("Donna"));
		System.out.println("Donna Phone: " + donnaPhone);
		
		Set<String> keys = map.keySet();
		System.out.println("Printing the keys...");
		keys.forEach(System.out::println);
		
		Set<Entry<String, String>> entries = map.entrySet();
		System.out.println("Print all key-value pairs using the forEach()");
		entries.forEach(entry -> {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key=" + key + ", value=" + value);
		});
		System.out.println("Print all key-value pairs using the Map forEach with BiConsumer");
		map.forEach((key, value) -> System.out.println("key=" + key + ", value=" + value));
		System.out.println("Donna key is removed: " + map.remove("Donna"));
	}

}
