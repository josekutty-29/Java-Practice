package encapsulation;

public class Student {
  private int studentId;
  private String studentName;
  private String course;
  private int mark;
  
  
  public void setId(int id)
  {
	  
	 studentId=id;
	  
  }
  
  public void setName(String name)
  {
	  
	 studentName=name;
	  
  }
  
  public void setCourse(String course)
  {
	  
	 this.course=course;
	  
  }
  
  public void setMark(int mark)
  {
	  
	 this.mark=mark;
	  
  }
  
  
  public int getId() {
	  return studentId;
  }
  
  public String getName() {
	  return studentName;
  }
  
  public String getCourse() {
	  return course;
  }
  
  public int getMark() {
	  return mark;
  }
  
  
  
  public void printStudentDetails() {
	  System.out.println("Id : "+studentId+"| Name : "+studentName+"| Course : "+course+"| Mark : "+mark);
  }
  
  
  
}
