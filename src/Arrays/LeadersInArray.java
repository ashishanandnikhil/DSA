package Arrays;

import java.lang.reflect.Array;

public class LeadersInArray {

	public static void main(String[] args) {
		int[] arr= {7,10,4,10,6,5,2};
		int n=arr.length;
		 LeadArray(arr,n);

	}

	public static void LeadArray(int[] arr, int n) {
		int[] ans = new int[n];
		 int curMax=arr[n-1];
	    //  System.out.println(curMax);
		 ans[0]=curMax;
		 int pos=1;
	      for(int i=n-2;i>=0;i--) {
	    	  if(curMax < arr[i]) {
	    		  curMax=arr[i];
	    		  ans[pos]=curMax;
	    		  pos++;
	    	  }
	      }
	      for(int i=0;i<ans.length;i++) {
	    	  ans[]
	      }
	      for(int i=0;i<pos;i++) {
	    	  if(i == pos) 
	    		  break;
	    	  System.out.println(ans[i]);
	      }
	}

}
