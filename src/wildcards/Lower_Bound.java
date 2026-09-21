package wildcards;

import java.util.*;

public class Lower_Bound {
	
		
		public static void display(List<? super Dog> al) {
			
			for(Object o : al) {
				System.out.println(o);
			}
			
			
		}
		public static void main(String[] args) {
			List<Animals> al=new ArrayList<>();
			al.add(new Animals("kaiser"));
			al.add(new Animals("tooki"));
			al.add(new Animals("peeppi"));
			display(al);
			
		}
}
