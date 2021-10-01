class Task02 
{
	public static void main(String[] args) 
	{
		System.out.println("1. Area Of Rectangle with sides 2 and 3");
		int l=2;
		int b=3;
		System.out.println("Area of Rectangle (length*breath) is : "+(l*b));
		System.out.println();

		System.out.println("2. Product of Numbers 8.2 and 6.0");
		double a=8.2;
		double c=6.0;
		System.out.println("Product of Numbers is : "+(a*c));
		System.out.println();

		System.out.println("3. ASCII Value of Character H");
		char d='H';
		int asciivalue=d;
		System.out.println("ASCII Value of charater H is : "+asciivalue);
		System.out.println();

		System.out.println("4. Convert double 100.235 to int");
		Double e= new Double("100.235");
		int f=e.intValue();
		System.out.println("Int value is : "+f);
		System.out.println();

		System.out.println("5. Add 3 to ASCII Value of character D and print it's equivalent character");
		char g='D';
		int asciivalue1=g;
		int asciivalue2=(asciivalue1+3);
		char h=(char)asciivalue2;
		System.out.println("New Character is : "+h);
		System.out.println();

		System.out.println("6. Add Int 5 and Double 6.2 then give result with 3 decimal points");
		int i= 5;
		double j= 6.2;
		double k=(i+j);
		System.out.println("Addition of int 5 and double 6.2 is : "+String. format("%.3f",k));
		System.out.println();
		System.out.format("Addition of int 5 and double 6.2 is : %.3f",k);
		System.out.println();

		System.out.println("7. Square of the Number 3.9");
		double m=3.9;
		System.out.println("Square of the number 3.9 is : "+(m*m));
		System.out.println();

		System.out.println("8. Cube of Number 3.2");
		double n=3.2;
		System.out.println("Cube of number 3.2 is : "+(n*n*n));
	}
}
