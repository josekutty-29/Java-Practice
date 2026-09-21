package list_Iterator;
import java.util.*;



public class Listiterator {
	
	public static void main(String args[]) {
		
		List<String> students=new ArrayList<String>();
		students.add("James");
		students.add("Joob");
		students.add("Jacky");
		students.add("Jeep");
		ListIterator<String> it=students.listIterator();
//		
//		 while(it.hasNext()) {
//			 System.out.println(it.next());
//		 }
//		 
		students.forEach(s ->System.out.println(s));
		 System.out.println("------------------------------------------------");
		 
//		 while(it.hasPrevious()) {
//			 System.out.println(it.previous());
//		 }
		 
		 while(it.hasNext()) {
			if(it.next().equals("Jacky")) {
				it.set("Chan");
			}
		 }
		 
		 students.forEach(s ->System.out.println(s) );
			  
		 
		 
		
		
		
	}

}
