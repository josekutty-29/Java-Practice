
public class Secondlargest {
	public static void main(String[] args) {
		int[] arr= {10,5,8};
		int largest=arr[0];
		int second_largest=arr[1];
	
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				second_largest=largest;
				largest=arr[i];
			}
			else {
				if(arr[i]>second_largest && arr[i]!=largest) {
					second_largest=arr[i];
				}
			}
			
		}
		System.out.println("largest: "+largest);
		System.out.println("second largest: "+second_largest);
		
}
}
