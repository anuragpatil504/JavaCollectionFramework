package hashSetDemo;

import java.util.HashSet;
import java.util.Set;

public class MainImpl {

	public static void main(String[] args) {
		Set<Student> st = new HashSet<>();
		st.add(new Student(1,"Anurag"));
		st.add(new Student(2,"John"));
		st.add(new Student(3,"Dutch"));
		st.add(new Student(3,"Dutch"));
		System.out.println(st);
		
	}

}
