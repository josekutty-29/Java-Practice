package camparators;

import java.util.*;




public class StudentMain {
	
	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		
		students.add(new Student("Jose",23));
		students.add(new Student("Jansen",21));
		students.add(new Student("Chris",20));
		students.add(new Student("Amal",28));
		Age_asc as=new Age_asc();
		Name_asc nm=new Name_asc();
		for(Student s : students) {
			System.out.println(s);
		}
		Collections.sort(students,nm);
		System.out.println("----------------------------");
		
		for(Student s : students) {
			System.out.println(s);
		}
		System.out.println("----------------------------");
		
		students.sort((s1,s2)->Integer.compare(s1.age, s2.age));
		for(Student s : students) {
			System.out.println(s);
		}//lamda way(no need to use implemets ,seperate class etcc...)
		
		
		
	}

}
