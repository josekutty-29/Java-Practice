import java.util.Scanner;
public class Arrays {
	public static void main(String[] args) {
		//int[] arr= {1,2,3,4,5};
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.print("[");
		for(int num:arr) {
			System.out.print(+num+" ");
		}
		System.out.print("]");
	}

}
