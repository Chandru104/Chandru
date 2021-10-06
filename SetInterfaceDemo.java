import java.util.*;
class  SetInterfaceDemo
{
	public static void main(String[] args) 
	{
		HashSet<String> obj1 = new HashSet<>();
		obj1.add("RED");
		obj1.add("PINK");
		obj1.add("Orange");
		obj1.add("Orange");
		HashSet<String> obj2 = new HashSet<>();
		obj2.add("RED");
		obj2.add("BLUE");
		obj1.addAll(obj2);
		System.out.println(obj1);
	}
}