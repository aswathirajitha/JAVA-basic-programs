package arrays;

public class arrFreq {
	public static void main(String[] args) {
		
		int a[]=new int[]{1,2,4,1,5,6,2,1};
		int f[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			int c=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
				c++;
			}
			    
				System.out.println("Elements :"+a[i]+"  =  "+c++);
			
		}
	}
}
