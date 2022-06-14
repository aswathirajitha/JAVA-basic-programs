package basicwok;

import java.util.Scanner;

public class array2 {
	public static void main(String[] args) {
	int[] a=new int[4];
	int[] b=new int[4];
	int[] c=new int[4];
	
	{
		System.out.println("Enter array one : ");
		try (Scanner sc = new Scanner(System.in)) {
			for(int i=0;i<4;i++) {
				 a[i]=sc.nextInt();
			}

			System.out.println("array one : ");
			for(int i=0;i<4;i++) {
				System.out.println(a[i]);
			}
			System.out.println("enter array two : ");
			for(int i=0;i<4;i++) {
				 b[i]=sc.nextInt();
			}
		}
		System.out.println("array two : ");
		for(int i=0;i<4;i++) {
			System.out.println(b[i]);
		}
		System.out.println("RESULT IS:");
		for(int i=0;i<4;i++) {
					c[i]=a[i]+b[i];
					System.out.println(c[i]);
					}
			}
		}
	

	
	}

