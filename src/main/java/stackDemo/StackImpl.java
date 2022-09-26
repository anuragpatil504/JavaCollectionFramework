//Stack is first in last out 
//Various methods are push pop peek

package stackDemo;

import java.util.Stack;

public class StackImpl {

	public static void main(String[] args) {
		Stack<String> animals = new Stack<>();
		animals.push("Lion");
		animals.push("Cat");
		animals.push("Dog");
		animals.push("Tiger");
		System.out.println(animals);
		
		//To check the top element
		System.out.println(animals.peek());
		
		
		//To remove the top element
		animals.pop();
		System.out.println(animals);

	}

}
