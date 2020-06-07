package queue;

import java.util.LinkedList;

public class Store {

	public static void main(String[] args) {
		LinkedList<Customer> queue = new LinkedList();
		queue.add(new Customer("Kihoon"));
		queue.add(new Customer("Beeny"));
		queue.add(new Customer("Tea"));
		//System.out.println(queue);
		
		serveCustomer(queue);
		System.out.println(queue);
	}
	
	static void serveCustomer(LinkedList<Customer> queue) {
		Customer c = queue.poll();
		c.serve();

	}
}
