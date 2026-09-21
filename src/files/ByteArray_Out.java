package files;
import java.io.*;
public class ByteArray_Out {
	static byte[] data;
	public static void main(String[] args) {
		ByteArrayOutputStream by=new ByteArrayOutputStream();
		by.write(10);
		by.write(15);
		
		data=by.toByteArray();
		
	}

}
