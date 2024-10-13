
public class q4 {
	static int f(int n)
	{
		
		if(n<10)
		{
			return 1;
		}
		
		else
		{
			return 1+ f( n/10);
		}
	}
	public static void main(String[] args) {
		int x=f(681);
		System.out.println(x);
	}

}
