import java.util.*;

class  MapInterfaceTask02
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> list = new HashMap<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of key value pairs to be updated : ");
		int num = sc.nextInt();
		System.out.println();

		if(num>0){
				System.out.println("Enter the Values : ");

				int n=101;
				for(int i=0; i<num; i++){
					String value = sc.next();
					list.put(n,value);
					n++;
				}

				System.out.println();
				System.out.println("Enter the Key to get searched for its presence : ");
				int key = sc.nextInt();
				System.out.println();

				if(list.containsKey(key))
					System.out.println("The key is present in the list");
				else
					System.out.println("The key is not present in the list");
			}

			else
				System.out.println("Enter valid number which is greater than 0");
	}
}
