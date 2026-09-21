package files;
import java.io.*;
public class File_Read {
	public static void main(String[] args) throws Exception{
		FileInputStream fi=new FileInputStream("sample.txt");
		int d;
		while((d=fi.read())!=-1){
			
			System.out.print((char)d);
			
			
		}
		fi.close();
		
	}
	
	

}
