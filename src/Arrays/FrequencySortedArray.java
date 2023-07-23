package Arrays;

public class FrequencySortedArray {

	public static void main(String[] args) {
		int[] arr= {40,50,50,50};
		freq(arr);

	}

	public static void freq(int[] arr) {
		
		int[] temp=new int[arr.length];
		int freq=1,k=0,t=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i] == arr[i-1]) {
				freq++; 
			}else if(arr[i] != arr[i-1]){
				t++;
				temp[k]=freq;
				k++;
				freq=1;
			}
			if(freq==1 && i==arr.length-1) {
				temp[k]=1;
			}

		}
		if(t==0 && freq >1) {
			temp[0]=freq;
		}
		
		for(int val:temp) {
			System.out.println(val);
		}
	}

}
