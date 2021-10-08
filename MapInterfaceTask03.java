import java.util.*;
class MapInterfaceTask03 // Iterator Demo
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> mapList = new HashMap<>();
		System.out.println("Enter the no of values to be added in the list : ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0){
			System.out.println("Enter the key and values to the list ");
			for(int i=0; i<n; i++){
				System.out.println("Enter Integer Key : ");
				int integer = sc.nextInt();
				System.out.println("Enter String Value : ");
				String string = sc.next();
				mapList.put(integer,string);
			}
			System.out.println(mapList);
			System.out.println();

			Iterator<Entry<Integer, String>> itr = mapList.entrySet().iterator();
			System.out.println("Enter values horizontally");
			while(itr.hasNext()){
				System.out.print(itr.next()+"\t");
			}
		}
		else
			System.out.println("Enter Valid num greater than 0");
	}
}
