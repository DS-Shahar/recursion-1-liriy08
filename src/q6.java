
public class q6 {
	static int f(int n, int m)
	{
	if(m==0)
	{
		return 0;
	}
	if(n<m)	
	{
		return n;
	}
	else
	{
		return f(n-m, m);
	}
	
	}
	public static void main(String[] args) {
		int x=f(23,4);
		System.out.println(x);
	}

}
