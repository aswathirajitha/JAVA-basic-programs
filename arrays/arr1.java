package arrays;

import java.util.Scanner;

public class arr1 {
	public static void main(String[] args) {
		 int [] arr1 = new int [4] ;     
           int arr2[] = new int[arr1.length];  
           
        Scanner sc = new Scanner(System.in);
   		System.out.println("enter array : ");
   		for(int i=0;i<4;i++) {
   			arr1[i]=sc.nextInt();
   		}

   
        for (int i = 0; i < arr1.length; i++) {     
            arr2[i] = arr1[i];     
        }      
          
        System.out.println("Elements of array1: ");    
        for (int i = 0; i < arr1.length; i++) {     
           System.out.print(arr1[i] + " ");    
        }     
            
        System.out.println();    
            
            
        System.out.println("Elements of array2: ");    
        for (int i = 0; i < arr2.length; i++) {     
           System.out.print(arr2[i] + " ");    
        }     
    }    
}    