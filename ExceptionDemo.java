import java.util.*;
class ExceptionDemo 
{
	public static void main(String[] args) 
	{
		int number;
		Scanner sc = new Scanner(System.in);
		try{
			number = Integer.parseInt(sc.next());
			System.out.println("The Number is : ");
		}
		catch(Exception e){
			System.out.println("It is a NumberFormatException");
			e.printStackTrace();
		}
	}
}