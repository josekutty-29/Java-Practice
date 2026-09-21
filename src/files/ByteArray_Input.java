package files;
import java.io.*;
public class ByteArray_Input  {
	public static void main(String[] args) throws Exception {
		ByteArray_Out.main(null);  
		ByteArrayInputStream bi=new ByteArrayInputStream(ByteArray_Out.data);
		
		int value;
		while((value=bi.read())!=-1) {
			System.out.println(value);
		}
	}

}
