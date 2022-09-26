//priority based queue

package queueDemo;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueImpl {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.offer(23);
		pq.offer(11);
		pq.offer(65);
		pq.offer(26);
		System.out.println(pq);//Here min heap is implemented therefore the element with least value
		//has max priority and will be first popped
		
		pq.poll();
		System.out.println(pq);
		
		System.out.println(pq.peek());
		
		
		//To give max value the priority we use comparator in the constructor
		
		Queue<Integer> pqn = new PriorityQueue<>(Comparator.reverseOrder());
		pqn.offer(13);
		pqn.offer(23);
		pqn.offer(10);
		pqn.offer(16);
	
		System.out.println(pqn);
		
		
		
	}

}
