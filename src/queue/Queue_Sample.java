package queue;


import java.util.*;

public class Queue_Sample {
   public static void main(String[] args) {
	   Queue<Integer> q= new PriorityQueue<>();
		  q.offer(100);
		  q.offer(2);
		  q.offer(30);
		  q.offer(1000);
		  q.forEach(s->System.out.println(s));
		  System.out.println(" ");
		  
		  q.poll();
		  
		  q.forEach(s->System.out.println(s));
		  System.out.println(" ");
		  
		  q.poll();
		  
		  q.forEach(s->System.out.println(s));
		  System.out.println(" ");
		  
		  
		  System.out.println("--------------------------------------------------------------------------------- ");
		  
		  
		  
		  Queue<Integer> q1= new LinkedList<>();
		  q1.offer(100);
		  q1.offer(2);
		  q1.offer(30);
		  q1.offer(1000);
		  q1.forEach(s->System.out.println(s));
		  System.out.println(" ");
		  
          q1.poll();
		  
		  q1.forEach(s->System.out.println(s));
		  System.out.println(" ");
		  
		  q1.poll();
		  
		  q1.forEach(s->System.out.println(s));
		  System.out.println(" ");
		  
		  
		  System.out.println("--------------------------------------------------------------------------------- ");

		  Deque<Integer> q2= new LinkedList<>();
		  q2.addFirst(100);
		  q2.offer(2);
		  q2.addLast(30);
		  q2.offer(1000);
		  q2.forEach(s->System.out.println(s));
		  System.out.println(" ");
		  
          q2.removeFirst();
		  
		  q2.forEach(s->System.out.println(s));
		  System.out.println(" ");
		  
		  q2.removeLast();
		  
		  q2.forEach(s->System.out.println(s));
		  System.out.println(" ");
		  
		  
		  System.out.println("--------------------------------------------------------------------------------- ");

   		  Deque<Integer> q3= new ArrayDeque<>();
		  q3.addFirst(100);
		  q3.offer(2);
		  q3.addLast(30);
		  q3.offer(1000);
		  q3.forEach(s->System.out.println(s));
		  System.out.println(" ");
		  
          q3.removeFirst();
		  
		  q3.forEach(s->System.out.println(s));
		  System.out.println(" ");
		  
		  q3.removeLast();
		  
		  q3.forEach(s->System.out.println(s));
		  System.out.println(" ");
		  
   }
}
