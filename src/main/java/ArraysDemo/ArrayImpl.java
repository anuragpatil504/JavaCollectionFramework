package ArraysDemo;

import java.util.Arrays;

public class ArrayImpl {

	public static void main(String[] args) {
		Integer[] arr = {1,2,7,4,5};
		Arrays.sort(arr); 
		for(Integer i : arr) {
			System.out.println(i);
		}
	}

}
