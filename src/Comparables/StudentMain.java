package Comparables;
import java.util.*;

public class StudentMain {
	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		students.add(new Student("Jose",23));
		students.add(new Student("Jansen",21));
		students.add(new Student("Chris",25));
		for(Student s : students) {
			System.out.println(s);
		}
		Collections.sort(students);
		System.out.println("----------------------------");
		
		for(Student s : students) {
			System.out.println(s);
		}
		
	}

}
