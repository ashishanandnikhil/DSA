package Arrays;

public class StockBuySell {

	public static void main(String[] args) {
		int[] arr= {1,5,3,8,12};
//		int start = 0,end = arr.length-1;
//		System.out.println(stock(arr,start,end));
		stock(arr);

	}

//	public static int stock(int[] arr, int start, int end) {
//		
//		
//		if(end <= start) {
//			return 0;
//		}
//		int profit=0;
//		for(int i=start;i<end;i++) {
//			for(int j=i+1;i<=end;i++) {
//				if(arr[j] > arr[i]) {
//					int currProfit= arr[j]-arr[i] + stock(arr,start,i-1) + stock(arr,j+1,end);
//					profit=Math.max(profit, currProfit);
//				}
//			}
//		}
//		return profit;
//	}		

	
	public static void stock(int[] arr) {
		
		int profit=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > arr[i-1] ) {
				profit=profit+ (arr[i] - arr[i-1]);
			}
		}
		System.out.println(profit);
	}
	
}
