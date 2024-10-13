
public class q1 {

	
	static int f(int n)
	{
		if(n==1)
		{
			return 1;
		}
		int a=n+f(n-1);
		return a;
	}
	public static void main(String[] args) {
		int x=f(2);
		System.out.println(x);
	}

}
