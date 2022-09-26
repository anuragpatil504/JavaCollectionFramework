//ArrayList is a class which implements List interface 
//It is similar to array but we cannot change size dynamically in array



package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> student  = new ArrayList<>(); 
		student.add("John Doe");
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		//Element is added at the last
		list.add(4);
		System.out.println(list);
		
		//Element to add at a particular index
		list.add(2, 50);
		System.out.println(list);
		
		//We can add list inside list
		ArrayList<Integer> newList = new ArrayList<>();
		newList.add(10);
		newList.add(20);
		list.addAll(newList);
		System.out.println(list);
		
		
		//We can get the elements from list
		System.out.println(list.get(3));
		
		
		//We can remove element from the list using index
		list.remove(2);
		System.out.println(list);
		
		
		//We can remove a particular element 
		list.remove(Integer.valueOf(3));
		System.out.println(list);
		
		//To remove all elements from list
//		list.clear();
//		System.out.println(list);
		
		
		//To update the value in the list
		list.set(1, 23);
		System.out.println(list);
		
		//To check if  element is present
		System.out.println(list.contains(23));
		
		//iterate in the arraylist
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for(Integer ele:list) {
			System.out.println(ele);
		}
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
