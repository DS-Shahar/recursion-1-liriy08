
public class q9 {
	static boolean f(int n)
	{
		if(n==0)
		{
			return true;
		}
		int num=n%10;
		if(num%2!=0)
		{
			return false;
		}
		return f(n/10);
	}
	public static void main(String[] args) {
		boolean answer=f(684);
		System.out.println(answer);
	}

}
