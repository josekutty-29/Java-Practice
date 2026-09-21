package files;
import java.io.*;
public class Student implements Serializable{
	
	
	String name;
	int id;
	int age;
	
	Student(String n,int id,int age){
		this.name=n;
		this.id=id;
		this.age=age;
	}
	public String toString() {
		return "Name="+name+"  Age ="+age +" id ="+id;
		
	}

}
