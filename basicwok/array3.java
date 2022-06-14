package basicwok;

import java.util.Scanner;

public class array3 {
	public static void main(String[] args) {
		int sum=0;
		int[] a=new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array : ");
		for(int i=0;i<=5;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("array : ");
		for(int i=0;i<=5;i++) {
			System.out.println(a[i]);
		}
		
		for(int i=0;i<=5;i++) {
			if(a[i]%2==0) {
				
			    sum=sum+a[i];	
		}
	}
		System.out.println("sum ="+sum);
}
}
