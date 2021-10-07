import java.util.*;
class MapInterfaceTask01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> mapList = new HashMap<>();

		System.out.println("Please enter first the key and then the value");
		System.out.println();
		for(int i=0; i<5; i++){
			System.out.println("Enter the string type of Key");
			String keyStr = sc.next();
			System.out.println();

			System.out.println("Enter the string type of Value");
			String valueStr = sc.next();
			System.out.println();

			mapList.put(keyStr, valueStr);
		}
		System.out.println();
		System.out.println("The keys in the list are : "+mapList.keySet());
		System.out.println();
		System.out.println("The values in the list are : "+mapList.values());
	}
}