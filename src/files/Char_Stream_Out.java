package files;
import java.io.*;
public class Char_Stream_Out {
  public static void main(String[] args) {
	  try(FileWriter f=new FileWriter("file.txt") ){
		  
		  String d="Hello vaasuuu";
		  f.write(d);
	  }
	  
	  catch(Exception e) {
		  System.out.println(e.getMessage());
		  
	  }
  }
}
