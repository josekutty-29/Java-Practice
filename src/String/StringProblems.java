package String;
import java.util.*;
public class StringProblems {
	public static void main(String[] args) {
	
	String str1="Hello";
	String str2="Hello";
	String str3="hello";
    String str4= new String("hello");
    String str5= new String(" hello");
	String s5=" h l ";
		System.out.println(str1==str2);
		System.out.println(str1==str3 );
		System.out.println(str1==str4 );
		System.out.println(str3==str4 );
		System.out.println(str4==str5 );
	    String x="";
		String s1=" sorry";
		char s3[]=s1.toCharArray();
		s1.concat(str5);
		System.out.println(s1.concat(str5));
		System.out.println(s1.charAt(1));
		System.out.println(s1.substring(1,3));
		System.out.println(s1.contains("l"));
		System.out.println(s1.repeat(1));
		System.out.println(s5);
		System.out.println(s5.trim());
		System.out.println(s1.equalsIgnoreCase(str3));
		System.out.println(s1.replace("H","J"));
		System.out.println(s1.indexOf("l"));
		for(int i=s1.length()-1;i>=0;i--) {
			//System.out.print(s1.charAt(i));
			x=x+s1.charAt(i);
		}
			System.out.println(x);
			
			if(s1.equals(x)) {
				System.out.println("Palindrome");
			}
			else {
				System.out.println("Not a Palindrome");
				
			}
			
			
//			System.out.print(s3[i]);
			char y;
		int count=0;
		for(int i=0;i<s1.length()-1;i++) {
			y=s1.charAt(i);
			if(y=='r') {
				count+=1;
				
			}
			
		}
		System.out.println(count);
		
		//string builder
		StringBuilder sb=new StringBuilder("Hello");
		sb.append(s1);
		System.out.println(sb);
		sb.insert(5, " tobi");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.reverse());
		System.out.println(sb);
		System.out.println(sb.deleteCharAt(0));
		System.out.println(sb.replace(0,4,"Hello"));
		
		//string buffer
		StringBuffer sp=new StringBuffer("Sabu");
		System.out.println(sp.capacity());
		sp.append(" Supooooooooofooooooooooooooooooooooer");
		System.out.println(sp);
		System.out.println(sp.capacity());
		
		
		
}
	
}
