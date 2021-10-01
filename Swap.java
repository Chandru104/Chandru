class Swap 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		int a=10;
		int b=20;
		System.out.println("Before Swapping a="+a+" b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping a="+a+" b="+b);
	}
}
