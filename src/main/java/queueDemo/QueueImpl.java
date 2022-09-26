//Queue is first in first out
//As one class can implement multiple interface LinkedList implements both list and queue
//Operations are offer, poll, peek

package queueDemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {

	public static void main(String[] args) {
		Queue<Integer> myQ = new LinkedList<>();
		myQ.offer(20);
		myQ.offer(40);
		myQ.offer(60);
		System.out.println(myQ);
		
		//TO remove an element we use poll
		myQ.poll();
		System.out.println(myQ);
		
		
		//To check the first element
		System.out.println(myQ.peek());
	}

}
