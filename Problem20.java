class Problem20 {
	public static void main(String [] args){
	int a=6;
	int count=0;
	int i;
	for(i=1;i<=a;i++){
	 if(a%i==0){
		count++;
	}
	}
	if(count==2){
		System.out.println("Prime");
	}
	else
	{
		System.out.println("Not a Prime");
	}
	}
}