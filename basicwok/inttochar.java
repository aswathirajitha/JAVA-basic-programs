package basicwok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inttochar {
	public static void main(String args[]) throws NumberFormatException,IOException {
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter a number : ");
		int a=Integer.parseInt(br.readLine());
		System.out.println("character of number :"+a);
		
				
	}
		

}
