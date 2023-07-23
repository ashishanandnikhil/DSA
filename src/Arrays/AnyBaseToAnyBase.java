package Arrays;

import java.util.Scanner;

public class AnyBaseToAnyBase {
	
	//Concept is right but some test cases are failing
	//Convert the Sourcebase to decimal first and then convert the decimal base to DestBase later 

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int num= scn.nextInt();
		int sBase = scn.nextInt();
		int dBase=scn.nextInt();
		
		int res=0;
		int count=0;
		while(num>0) {
			int rem=num%dBase;
			res=res + rem*(int)Math.pow(sBase, count);
			count++;
			num=num/dBase;
		}
		System.out.println(res);

	}

}
