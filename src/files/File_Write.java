package files;
import java.io.*;
public class File_Write {
	public static void main(String[] args) throws Exception {
		FileOutputStream fo= new FileOutputStream("sample.txt");
		String str="Toby is bad";
		fo.write(str.getBytes());
		fo.close();
	}
	
	

}
