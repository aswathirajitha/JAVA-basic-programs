package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrSmallest {
public static void main(String[] args) {
		
		int[] a=new int[4];
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array : ");
		for(int i=0;i<=3;i++) {
			a[i]=sc.nextInt();
		} 
	         Arrays.sort(a);
	     	System.out.println("sorted array element : ");
	         for (int i = 0; i < a.length; i++)   
	         {       
	         System.out.print(a[i]+" ");   
	         }   
	         System.out.println(); 
	     	System.out.println("SMALLEST : "+a[0]);
		
}

}
