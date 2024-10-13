
public class q3 {
	static int f(int n)
	{
		if (n%2==0)
		{
			n=n-1;
		}
		if(n==1)
		{
			return 1;
		}
		int a=n*f(n-2);
		return a;
	}
	public static void main(String[] args) {
		int x=f(6);
		System.out.println(x);		
	}

}
