
public class Arrayequals {
	public static void main(String[] args) {
		int[] arr1= {10,20,30,40,50};
		int[] arr2= {10,20,30,40  };
		int flag=1;
		if(arr1.length==arr2.length) {
			
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				flag=0;
				break;
			}
			
		}
		
			if(flag==1) {
				System.out.println("Both arrays are same");
			}
			else {
				System.out.println("Both arrays are not same");
			}
			
		}

		else {
			System.out.println("Both arrays are not same");
		}

}
}


