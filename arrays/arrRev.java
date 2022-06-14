package arrays;

import java.util.Scanner;

public class arrRev {
	public static void main(String[] args) {
		int[] a=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array : ");
		for(int i=0;i<=4;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("array elements:");
		for(int i=0;i<=4;i++) {
			System.out.print(a[i] +" ");
		}
		System.out.println();
		System.out.println("Reversed array elements:");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i] +" ");
		}

}
}