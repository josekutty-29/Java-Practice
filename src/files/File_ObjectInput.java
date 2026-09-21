package files;
import java.io.*;
import java.util.*;
public class File_ObjectInput {
	
	public static void main(String[] args) throws Exception{
		ObjectInputStream oi=new ObjectInputStream(new FileInputStream("new.txt"));
		try {
			while(true) {      
			
		
		Student s1= (Student)oi.readObject();
		System.out.println(s1);
		}
		}
		catch(EOFException e) {
			System.out.println("End Of File");
			
		}
		oi.close();
	}

}
