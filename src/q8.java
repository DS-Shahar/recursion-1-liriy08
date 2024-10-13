
public class q8 {
	static boolean f(int n, int m)
	{
	if (n<2)
	{
		return false;
	}
		
	if(m>=n)
	{
		return true;
	}
	if(n%m==0)
	{
		return false;
	}
	else 
	{
    return f(n, m+1); 
    }
	
	}
	public static void main(String[] args) {
		boolean answer=f(5,2);
		System.out.println(answer);
	}

}
