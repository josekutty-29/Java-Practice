package files;
import java.io.*;
public class VedioReader {
	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("\\C:\\Users\\josek\\Downloads\\husky.mp4");
			FileOutputStream fos=new FileOutputStream("newhusky.mp4")
			) {
			
			byte[] buffer=new byte[4096];
			int bytesRead;
			
			while((bytesRead=fis.read(buffer))!=-1){
				
				fos.write(buffer, 0, bytesRead);
				
			}
			
			
				
			}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
			
		}
	}
   
}
