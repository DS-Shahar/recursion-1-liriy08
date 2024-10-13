
public class q7 {
	static boolean f(int x, int y)
	{
	if(y==0)
	{
		return false;
	}
	if(x==0)	
	{
		return true;
	}
	if (x>y)
	{
		return false;
	}
	if (x==y)
	{
		return true;
	}
	
		return f(x, y-x);
	
	
	}
	public static void main(String[] args) {
		boolean answer=f(4,24);
		System.out.println(answer);
	}

}
