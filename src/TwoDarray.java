import java.util.Scanner;
public class TwoDarray {
public static void main(String[] args) {
int r;
int c;
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of the row and colunm");
System.out.println(" ");
r=sc.nextInt();
c=sc.nextInt();
int[][] arr=new int[r][c];

System.out.println("Enter the elements");
for(int i=0;i<r;i++) {
	for(int j=0;j<c;j++) {
		arr[i][j]=sc.nextInt();
	}      
}
//System.out.println("The 2D array is : ");
for(int i=0;i<c;i++) {
	for(int j=0;j<r;j++) {
		
		System.out.print(arr[j][i]+" ");
	}
     System.out.println();

}


	
}

}

