package arrays;

import java.util.Scanner;

public class EvenEle {
	public static void main(String[] args) {
		int[] a=new int[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array : ");
		for(int i=0;i<=3;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("array elements:");
		for(int i=0;i<=3;i++) {
			System.out.print(a[i] +" ");
		}
		System.out.println();
		System.out.println("Even position array elements:");
        for (int i = 0; i < a.length; i++) {   
        	if(i%2!=0) {
        			System.out.print(a[i] +" ");
        	}
        
        }
	}
}
