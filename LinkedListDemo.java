import java.util.*;
class LinkedListDemo 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> listInt = new LinkedList<Integer>();
		listInt.add(2);
		listInt.add(3);
		listInt.add(4);
		listInt.add(8);
		listInt.add(9);
		listInt.add(10);
		System.out.println("Before adding First and Last Item or Element : "+listInt);

		listInt.addFirst(1);
		listInt.addLast(11);
		System.out.println("After adding First and Last Item or Element : "+listInt);

		System.out.println("The First Element is : "+listInt.getFirst());

		System.out.println("The Last Element is : "+listInt.getLast());

		listInt.removeFirst();
		listInt.removeLast();
		System.out.println("After removing First and Last Item or Element : "+listInt);

		System.out.println("Size of the List is "+listInt.size());
	}
}