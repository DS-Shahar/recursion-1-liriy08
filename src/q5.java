
public class q5 {
	static int f(int n, int m)
	{
	if(m==0)
	{
		return 0;
	}
	if(n-m<m)	
	{
		return 1;
	}
	else
	{
		return 1+f(n-m, m); 
	}
	
	}
	public static void main(String[] args) {
		int x=f(21,4);
		System.out.println(x);
	}

}
