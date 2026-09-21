package files;
import java.io.*;
public class File_BuffWrite {
	public static void main(String[] args) throws Exception
	{
		 BufferedOutputStream bo=new BufferedOutputStream( new FileOutputStream("sample.txt"));
		 String str="Toby is a cat";
		 bo.write(str.getBytes());
		 bo.close();
	}

}
