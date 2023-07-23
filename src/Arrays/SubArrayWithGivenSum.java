package Arrays;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		int[] arr= {4,8,12,5};
		int sum=17;
		System.out.println(sum(arr,sum));

	}

//	public static void sum(int[] arr, int sum) {
//		int idx=0;
//		int currSum=arr[idx];
//		int lol=0;
//		for(int i=1;i<arr.length;i++) {
//			currSum=currSum+arr[i];
//			if(currSum > sum) {
//				idx++;
//				i=idx-1;
//				currSum=0;
//			}
//			if(currSum == sum) {
//				System.out.println("yes");
//				 lol=1;
//				break;
//			}
//		}
//		if(lol != 1) {
//		int sumN=0;
//		for(int i=0;i<arr.length;i++) {
//			sumN=sumN+arr[i];	
//		}
//		if(sumN != sum) {
//			System.out.println("no	");
//		}
//		}
//		
//		
//	}
	
	public static boolean sum(int[] arr, int sum) {
		int s=0;
		int curr=0;
		for(int e=0;e<arr.length;e++) {
			curr=curr+arr[e];
			while(sum < curr) {
				curr = curr-arr[s];
				s++;
			}
			if(sum==curr) {
				return true;
			}
		}
		return false;
	}
}
