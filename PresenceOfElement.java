import java.util.*;
class PresenceOfElement 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arInt = new ArrayList<Integer>();
		int count=0;

		System.out.println("Enter the length of the array :");
		int length= sc.nextInt();

		if(length>0){
			System.out.println("Enter the elements :");
			for(int i=0; i<length; i++){
				arInt.add(sc.nextInt());
			}

			System.out.println("Enter the number to be searched :");
			int n=sc.nextInt();
				
			if(arInt.contains(n))
				System.out.println("The number "+n+" is present in the array");
			else
				System.out.println("The number "+n+" is not present in the array");
		}

		else
			System.out.println("Enter valid length");
	}
}
