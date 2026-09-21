  package vectors;
import java.util.*;

public class StudentMain {
	
	public static void main(String[] args) {
		List<Student> students=new ArrayList<Student>();
		students.addAll(Arrays.asList(new Student("Jose",1,"java"),new Student("James",2,"python")));
		//System.out.println(students);
		
		students.forEach(student->System.out.println(student));
		
		
		for(Student s:students) {
			if(s.getId()==1) {
				s.setName("Toby");
			}
		}
		System.out.println(students);
		
		students.removeIf(student->student.getId()==1);
		
		students.forEach(s->System.out.println(s));
		
		
		
	}

} 