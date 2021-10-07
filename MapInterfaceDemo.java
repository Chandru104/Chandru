import java.util.*;
public class MapInterfaceDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> mapList = new HashMap<>();

		// Inserting List
		System.out.println("Please enter first the key and then the value");
		for(int i=0; i<5; i++){
			mapList.put(sc.nextInt(), sc.next());
		}
		System.out.println(mapList);
		System.out.println();

		// Updating List
		System.out.println("Update any of above entered key values by entering its key and value");
		mapList.put(sc.nextInt(), sc.next());
		System.out.println(mapList);
		System.out.println();

		// Deliting List
		System.out.println("Delete any of the above list values by entering its key");
		String removeValue = mapList.remove(sc.nextInt());
		System.out.println(mapList);
	}

}

