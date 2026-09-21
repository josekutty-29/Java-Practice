
public class Twodequals {
	public static void main(String[] args) {
		int[][] arr1= {{1,2,3},{4,5,6}};
		int[][] arr2= {{1,2,3},{4,5,6   }};
		int flag=1;
		
		if((arr1.length==arr2.length) && (arr1[0].length==arr2[0].length)) {
			
			outerloop:
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr1[0].length;j++) {
					
					if(arr1[i][j]!=arr2[i][j]) {
						flag=0;
						break outerloop;
					}
					
						
						
					}
				}
			if(flag==1) {
				System.out.println("Both 2D arrays are Same");
				
			}
			else {
				System.out.println("Both 2D arrays are not Same");
			}
					
					
				}
		else {
			System.out.println("Both 2D arrays are not Same");
		}
		}
	

}
