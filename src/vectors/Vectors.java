package vectors;
import java.util.*;
public class Vectors {
 public static void main(String args[]) {
	 Vector<Integer> v=new Vector<Integer>();
	
	 
	 v.add(1);
	 v.add(2);
	 v.add(3);
	 v.add(4);
	 Iterator<Integer> it=v.iterator();
	 while(it.hasNext()) {
		 Integer i=it.next();
		 System.out.println(i);
		 
	 }
	
	 v.get(2);
	 System.out.println(v.get(3));
	 v.remove(0);
	 System.out.println(v);
	 System.out.println(v.indexOf(2));
	 
	 Vector<Integer> v1=new Vector<Integer>();
	 v1.add(10);
	 v1.add(2);
	 v.addAll(v1);
	 System.out.println(v);
	 
//	 v.removeAll(v1);
//	 System.out.println(v);
	 
	 v.retainAll(v1);
	 System.out.println(v);
	
	 
	 
	 
 }
}
