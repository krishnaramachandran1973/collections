package com.wipro.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import com.wipro.model.Person;

public class PriorityQueueComparatorTest {
	public static void main(String[] args) {
		Comparator<Person> nameComparator = Comparator.comparing(Person::getName);
		// Create a priority queue with a Comparator
		Queue<Person> pq = new PriorityQueue<>(nameComparator);
		pq.add(new Person(1, "John"));
		pq.add(new Person(4, "Ken"));
		pq.add(new Person(2, "Richard"));
		pq.add(new Person(3, "Donna"));
		pq.add(new Person(4, "Adam"));
		System.out.println("Priority queue: " + pq);
		while (pq.peek() != null) {
			System.out.println("Head Element: " + pq.peek());
			pq.remove();
			System.out.println("Removed one element from Queue");
			System.out.println("Priority queue: " + pq);
		}
	}

}
