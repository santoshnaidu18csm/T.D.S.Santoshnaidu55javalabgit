class Problem11 
{
	public static void main()
	{
		int a=123;
		int rev=0;
		int n=0;
		while(a>0)
		{
		n=a%10;
		rev=rev*10+n;
		a=a/10;
		}
		System.out.println(rev);
	}
}