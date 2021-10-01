import java.util.*;
class Task05 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char character = sc.next().charAt(0);
		int asciivalue = (int) character;
		//System.out.println(c);

		if(asciivalue>=65 && asciivalue<=90){
			System.out.println("Entered Character is UpperCase");
		}

		else if(asciivalue>=97 && asciivalue<=122){
			System.out.println("Entered Character is LowerCase");
		}

		else{
			System.out.print("Enter Valid Character to validate");
		}
	}
}