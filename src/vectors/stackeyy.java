package vectors;
import java.util.*;
public class stackeyy {
	
	public static void main(String[] args) {
		Stack<Integer> st=new Stack<Integer>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
//		System.out.println(st);
//		System.out.println(st.pop());
//		System.out.println(st);
//		System.out.println(st.peek());
//		System.out.println(st);
		st.forEach(s ->System.out.println(s) );
		
	}

}
