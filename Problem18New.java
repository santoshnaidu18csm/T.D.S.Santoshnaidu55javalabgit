class Problem18New
{
	public static void main(String[] args) 
	{
		int a=12321;
		int rev=0;
		int n=0;
		int z=a;
		while(a>0){
		n=a%10;
		rev=rev*10+n;
		a=a/10;
		}
		if(rev==z) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
        }    
	}
}