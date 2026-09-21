
public class Students {
	String name;
	int id;
	String course;
	Students(String name,int id,String course){
		this.name=name;
		this.id=id;
		this.course=course;
	}
	
	void printStudentDetails() {
		System.out.println("Student: "+name+"|"+"Student ID: "+id+" | Course : "+course);
	}
	
   
}
