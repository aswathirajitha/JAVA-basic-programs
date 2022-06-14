package task;

public class trueTable {

	public static void main(String[] args) {
		boolean p[];
		p = new boolean[4];
		p[0] = true;
		p[1] = true;
		p[2] = false;
		p[3] = false;
		
		boolean q[];
		q = new boolean[4];
		q[0] = true;
		q[1] = false;
		q[2] = true;
		q[3] = false;
		
		System.out.println( "P \t Q \tPANDQ \tPORQ \tPXORQ \tNOTP");
		for(int i=0;i < p.length;i++)
		{
			System.out.println( p[i] +"\t"+ q[i]+"\t"+ (p[i]&q[i])+"\t"+ (p[i]|q[i])+"\t"+ (p[i]^q[i])+"\t"+ (!p[i]));
		}
		
	}
	

}
