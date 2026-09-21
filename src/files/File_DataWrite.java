package files;

import java.io.*;
import java.io.FileOutputStream;

public class File_DataWrite {
	public static void main(String[] args) throws Exception
	{
		 DataOutputStream d1=new DataOutputStream( new FileOutputStream("sample2.txt"));
		 int num=500;
		  double num1=1000.11;
		 d1.writeInt(num);
		 d1.writeDouble(num1);
		 d1.close();
	}

}
