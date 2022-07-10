package collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashmap {
public static void main(String[] args) {
	
	int i,n;
	String name;
    int age;
	 System.out.println("Enter number of employee: ");
	    Scanner s=new Scanner(System.in);
		n = s.nextInt();

	Map<Integer,employee> map=new HashMap<Integer,employee>();
	employee[] emp=new employee[n];
	for(i=0;i<n;i++)
	{
	    name = s.next();
		age = s.nextInt();
		emp[i]=new employee();
		emp[i].setAge(age);
		emp[i].setName(name);
		map.put(i, emp[i]);
	}
	for(Map.Entry<Integer,employee> en:map.entrySet())
{
	int key=en.getKey();
	employee e=en.getValue();
	System.out.println(key+"\t"+e.getName()+"\t"+e.getAge());
	}
}
}
