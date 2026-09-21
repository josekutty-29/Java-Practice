package encapsulation;

public class StudentMain {
  public static void main(String[] args) {
	  Student std=new Student();
	  std.setId(1);
	  std.setName("Chris");
	  std.setCourse("Physics");
	  std.setMark(95);
	  
	  std.printStudentDetails();
	  std.setMark(100);
	  std.printStudentDetails();
	  System.out.println("Mark Of Chris : "+std.getMark());
  }
}
