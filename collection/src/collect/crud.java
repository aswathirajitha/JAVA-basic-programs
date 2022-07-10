package collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class crud {
	
	public static void main(String[] args) {  
		
	
			ArrayList list=new ArrayList();
		
		int n,i;
		String a;
		String u;
		do{    
	        System.out.println("1.Display installed applications\r\n"
	        		+ "2.Install an application\r\n"
	        		+ "3.Uninstall an application\r\n"
	        		+ "4.Update\r\n"
	        		+ "5.Quit");    
	        System.out.println("Enter a choice: ");
		    Scanner s=new Scanner(System.in);
			n = s.nextInt();
			
			switch(n) {
		    
		    case 1:if(list.isEmpty()) {
		    	    System.out.println("There is no Application Installed");
		            }
		     		else 
		     		{
		     			Iterator itr=list.iterator();
		     			while(itr.hasNext())
		     			{
		     				System.out.println(itr.next()+"  ");
		     			}
		     		}
		    	   break; 
		    
		    case 2:System.out.println("Enter Application Name:");
		    	   a= s.next();
		    	   list.add(a);
		    	   System.out.println("Application Successfully Installed...");
		    	   break;
		    	   
		    case 3:
		    Iterator itr=list.iterator();
		    int j = 0;
			while(itr.hasNext())
			{   
				System.out.print(j+" ");
				System.out.println(itr.next()+" ");
				j++;
			}
 			System.out.println("Enter the index no. to be deleted...");
 			i = s.nextInt();
 			list.remove(i);
			break;
			
		 case 4:Iterator itr1=list.iterator();
		 int k = 0;
			while(itr1.hasNext())
			{   
				System.out.print(k+" ");
				System.out.println(itr1.next()+" ");
				k++;
			}
			System.out.print("Enter Application do you want to update:");
			u = s.next();
			list.set(0,u);  	 	 
		 break;
		}
	    }while (n!=5);  
	    
	}

} 


