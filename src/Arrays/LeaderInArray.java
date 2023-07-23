package Arrays;

public class LeaderInArray {
	
	public static void main(String[] args) {
		int[] arr = {30,20,10};
		leader(arr);
	}

	public static void leader(int[] arr) {
		
		int[] temp = new int[arr.length];
		temp[0]=arr[arr.length-1];
		int currMax=temp[0];
		int k=1;
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i] > currMax) {
				temp[k++]=arr[i];
				currMax=arr[i];
			}
		}
		
		int p=0,count=0;
		for(int i=0;i<temp.length;i++) {
			if(temp[i] !=0) {
				temp[p++]=temp[i];
			}else {
				count++;
			}
		}
		
		for(int i=0;i<=count;i++) {
			System.out.println(temp[i]);
		}
	}

}
