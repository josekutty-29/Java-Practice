package set;
import java.util.*;

public class Sample {
  public static void main(String[] args) {
	  
	  
	  Set<Integer> set= new HashSet<>();
	  set.add(100);
	  set.add(2);
	  set.add(30);
	  set.add(1000);
	  set.forEach(s->System.out.println(s));
	  System.out.println(" ");
	  
	  
	  
	  Set<Integer> set1= new LinkedHashSet<>();
	  set1.add(100);
	  set1.add(2);
	  set1.add(30);
	  set1.add(1000);
	  set1.forEach(s->System.out.println(s));
	  System.out.println(" ");
	  
	  
	  Set<Integer> set2= new TreeSet<>();
	  set2.add(100);
	  set2.add(2);
	  set2.add(30);
	  set2.add(1000);
	  set2.forEach(s->System.out.println(s));
	  
  }
}
