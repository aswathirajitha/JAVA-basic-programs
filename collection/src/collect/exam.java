package collect;

import java.util.ArrayList;
import java.util.Iterator;

public class exam {
	
	
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		
		list.add(1);
		list.add("Aswathi");
		list.add(true);
		
		list.set(1, "amala");
		
		list.remove(0);
		Iterator itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}

}
