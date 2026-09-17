class Problem12
{
	public static void main() 
	{
		int a=123;
		int sum=0;
		int n=0;
		while(a>0){
		n=a%10;
		sum=sum+n;
		a=a/10;
		}
		System.out.println(sum);
	}
}