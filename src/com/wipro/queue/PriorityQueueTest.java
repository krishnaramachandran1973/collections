package com.wipro.queue;

import java.util.PriorityQueue;

import com.wipro.model.Person;

public class PriorityQueueTest {
	public static void main(String[] args) {
		var pq = new PriorityQueue<>();

		pq.add(new Person(4, "Ken"));
		pq.add(new Person(2, "Richard"));
		pq.add(new Person(3, "Donna"));
		pq.add(new Person(1, "John"));
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
