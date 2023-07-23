package Arrays;

public class SubArrayWithSum {
	
	public static void main(String[] args) {
		int[] arr= {1,4,20,3,10,5};
		int sum=33;
		subArr(arr,sum);
	}

	public static void subArr(int[] arr,int sum) {
		
		int curr=0;
		int s=0;
		for(int i=0;i<arr.length;i++) {
			
			curr=curr+arr[i];
			
			while(curr > sum) {
				curr=curr-arr[s];
				s++;
			}
			if(curr==sum) {
				System.out.println("yes");
			}
		}
		
	}

}
