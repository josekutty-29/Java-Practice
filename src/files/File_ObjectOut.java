package files;

import java.io.*;

public class File_ObjectOut {
  public static void main(String[] args) throws Exception{
	  Student s1=new Student("sabu",10,44);
	  Student s2=new Student("babu",11,20);
	  Student s3=new Student("jabu",12,32);
	  
	  ObjectOutputStream op=new ObjectOutputStream(new FileOutputStream("new.txt"));
	  op.writeObject(s1);
	  op.writeObject(s2);
	  op.writeObject(s3);
	  op.close();
  }
}
