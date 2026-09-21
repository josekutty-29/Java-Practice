package maps;
import java.util.*;

public class Map_Sample {
  public static void main(String[] args) {
   Map<Integer,String> m=new HashMap<>();	  
   m.put(1,"Apple");
   m.put(2,"Orange");
   m.put(3,"Grapes");
   m.put(4,"Apple");
   System.out.println(m);
   
   Map<Integer,String> m1=Map.of(1,"Jose",2,"Peter");//this map cannot be modified later
   System.out.println(m1);
  // m1.put(3,"parker"); this will cause error
   
   Map<Integer,String> m2=new HashMap<>();
   m2.put(1,"Avacado");
   m2.putAll(m);
   System.out.println(m2);
   
   
   System.out.println("--------------------------------------------");
   
   
  
      Map<Integer,String> m3=new TreeMap<>();	  
      m3.put(2,"Apple");
      m3.put(1,"Orange");
      m3.put(3,"Grapes");
      m3.put(4,"Apple");
      System.out.println(m3);
     
      
     
   
   
   
   
  
	  
	  
  }
}
