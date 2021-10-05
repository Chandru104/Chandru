import java.util.*;
class ArrayListDemo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> intArray = new ArrayList<Integer>();

		System.out.println("Enter the number of arrays to get added and displayed");
		int n = sc.nextInt();

		System.out.println("Enter the integer to be added in the array");
		for(int i=0; i<n; i++){
			intArray.add(sc.nextInt());
		}
		System.out.println(intArray);
	}
}