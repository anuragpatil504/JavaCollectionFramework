//Doubly ended queue
/*As it implements queue it will have same operations like offer poll but has some additional
 * operations like offerfirst and offerlast similarily with peek and poll like pollfirst polllast 	 
 */

package queueDemo;

import java.util.ArrayDeque;

public class ArrayDequeImpl {

	public static void main(String[] args) {
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		adq.offer(13);
		adq.offer(15);
		adq.offer(14);
		adq.offer(12);
		
		System.out.println(adq);
		adq.offerFirst(11);
		adq.offerLast(16);
		System.out.println(adq);
		
		adq.pollFirst();
		adq.pollLast();
		System.out.println(adq);
		
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());

	}

}
