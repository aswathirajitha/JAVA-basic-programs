package collect;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist {

	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		int n;
		String name;
	    String address;
	    int phonenumber;
	    
		 System.out.println("Enter number of customer: ");
		    Scanner s=new Scanner(System.in);
			n = s.nextInt();
			
			for (int i=0;i<n;i++) {
			    System.out.println("enter name : ");
			    name= s.next();
				
				System.out.println("enter address : ");
				address= s.next();
				
				System.out.println("enter phonenumber : ");
				phonenumber= s.nextInt();
				list.add(name);
				list.add(address);
				list.add(phonenumber);
			}
			Iterator itr=list.iterator();
	
			while(itr.hasNext())
			{
				System.out.println(itr.next()+" ");
			}
}
}

