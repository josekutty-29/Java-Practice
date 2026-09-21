package vectors;

public class Student {
	private String name;
	private int id;
	private String course;
	
	Student(String a,int b,String c){
		name=a;
		id=b;
		course=c;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getCourse() {
		return course;
	}
	public void setName(String n) {
		name=n;
		
	}
	
	public void setId(int n) {
		id=n;
		
	}
	
	public void setCourse(String n) {
		course=n;
		
	}
	
	public String toString() {
		return name +" | "+id+" | "+course;
	}
	
	

}
