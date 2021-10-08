import java.util.*;
class Array2ArrayList
{
	public static void main(String[] args) 
	{
		String [] array = {"Rose", "Jasmin", "Lilly"};
		ArrayList<String> arList = new ArrayList<>();
		Collections.addAll(arList, array);
		System.out.println("Before reversing : "+arList);
		Collections.reverse(arList);
		System.out.println("After reversing : "+arList);
	}
}