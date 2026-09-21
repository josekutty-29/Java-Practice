package java_nio;
import java.nio.file.*;
//import java.nio.file.Paths;
//import java.nio.file.Path;

public class File_Basics {
	public static void main(String[] args)  {
		try {
	    Path p1=Paths.get("fruits");
	    Files.createDirectory(p1);
		Path p=Paths.get("apple.txt");
		Files.writeString(p,"TOBYYY");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
