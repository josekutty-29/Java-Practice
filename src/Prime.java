
public class Prime {
	public static void main(String[] args) {
		int start=16;
		int end=50;
		int flag=0;
	
			
		for(int i=start;i<=end;i++) {
			flag=1;
			for(int j=2;j<=i/2;j++) {
			if(i%j==0) {
				flag=0;
				break;
			  
			 
				
			}
			
		
			
		}
			if(flag==1) {
				 System.out.println(i);
			}
			
		
			
		
		
	
}
}
}


