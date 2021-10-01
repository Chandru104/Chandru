import java.util.*;
class Task03
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the total amount :");
		Scanner sc= new Scanner(System.in);
		int amount=sc.nextInt();
		if(amount>=1000){
			int discount=amount/10;
			System.out.println("Your amount to be paid is "+(amount-discount)+" with the discount of 10% "+discount+" since the total amount is greater than 1000");
		}
		else if(amount<1000 && amount>0){
			System.out.println("Your amount to be paid is "+amount+" and the discount is 0% since the total amount is less than 1000");
		}
		else{
			System.out.println("Enter Valid Amount");
		}
	}
}
