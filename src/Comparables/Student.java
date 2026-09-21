package Comparables;

public class Student implements Comparable<Student> {
	
	String name;
	int age;
	
	Student(String s,int a){
		name=s;
		age=a;
	}
	
	public String toString() {
		return "Name="+name+"  Age ="+age;
		
	}
	public int compareTo(Student s) {
//		return this.age-s.age;  
		return this.name.compareTo(s.name); //compareTo method in String
	}
	

}   //comparable can perform sorting only once
