package set;

import java.util.*;


public class StudentMain {
	public static void main(String[] args) {
		Set<Student> students=new HashSet<Student>();
		students.addAll(Arrays.asList(new Student("Jose",1,"java"),new Student("Jose",1,"java")));
		//System.out.println(students);
		
		students.forEach(student->System.out.println(student));
		
		
//		for(Student s:students) {
//			if(s.getId()==1) {
//				s.setName("Toby");
//			}
//		}
//		System.out.println(students);
//		
//		students.removeIf(student->student.getId()==1);
//		
//		students.forEach(s->System.out.println(s));
		
		
		
	}
}
