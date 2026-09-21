
public class Pyramid {
	public static void main(String[] args) {
		int n=1;
		for(int i=0;i<=5-1;i++) {
			for(int k=0;k<5-i-1;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i*2+1;j++) {
				
				System.out.print("A"+" ");
				n++;
				
				}
			System.out.println();
			
		}
	}
}
