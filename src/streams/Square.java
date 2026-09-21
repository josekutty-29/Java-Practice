package streams;
import java.util.*;
public class Square {
public static void main(String args[]) {
	List<Integer> nums=new ArrayList<>();
	nums.add(50);
	nums.add(80);     
	nums.add(30);
	nums.add(40);
	
	List<Integer> result=nums.stream().map(x->x*x).toList();
	result.forEach(num->System.out.println(num));
	  
	System.out.println()	;
	List<Integer> result1=nums.stream().filter(x->x>20).toList();
	result1.forEach(num->System.out.println(num));
	
	System.out.println();
	List<Integer> result2=nums.stream().sorted().toList();
	result2.forEach(num->System.out.println(num));
	
	System.out.println();
	List<Integer> result3=nums.stream().sorted(Comparator.reverseOrder()).toList();
	result3.forEach(num->System.out.println(num));
	
	
	
	
}
}
