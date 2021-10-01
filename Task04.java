import java.util.*;
class Task04 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter total number of classes held : ");
		int classHeld = sc.nextInt();

		System.out.println("Enter total number of classes attended : ");
		int classAttended = sc.nextInt();

		if(classHeld<0 || classAttended<0){
			System.out.println("Enter Valid Data");
		}

		else if(classHeld>=classAttended){

			int percent=(100*classAttended/classHeld);

			if(percent>75){
				System.out.println();
				System.out.println("He got "+percent+"% percentage of attendance");
				System.out.println();
				System.out.println("This student is allowed to sit in exam");
			}

			else if(percent<=75){
				System.out.println();
				System.out.println("He got "+percent+"% percentage of attendance");
				System.out.println();
				System.out.println("This student is not allowed to sit in exam");
			}
		}

		else{
			System.out.println("Enter Valid Data");
		}
	}
}