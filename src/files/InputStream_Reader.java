package files;
import java.io.*;
import java.util.*;
public class InputStream_Reader {
	public static void  main(String[] args) {
		try(InputStreamReader ir=new InputStreamReader(System.in)){
			int ch;
			while((ch=ir.read())!='\n') {
				System.out.print((char)ch);
				
			}
			
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
			
		}
	}

}
