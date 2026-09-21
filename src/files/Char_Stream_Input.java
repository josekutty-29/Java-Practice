package files;
import java.io.*;

public class Char_Stream_Input {
	
	public static void main(String[] args) {
		
		try(FileReader fr=new FileReader("file.txt")){
			
			int ch;
			while((ch=fr.read())!=-1){
				System.out.print((char)ch);
				
			}
			
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
			
			
		}
		
	}

}
