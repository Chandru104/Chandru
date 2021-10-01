import java.util.*;
class Task06 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Need to take 10 integer from user and store those in an array and then need to print those");

		System.out.println();
		int array01[]= new int[10];

		System.out.println("Give the Array Elements : ");
		for(int i=0; i<array01.length; i++){
			array01[i]=sc.nextInt();
		}

		System.out.println();
		System.out.println("Array Elements are : ");
		for(int i=0; i<array01.length; i++){
			System.out.print(array01[i]+"\t");
		}

		System.out.println();
		System.out.println();

		System.out.println("2. Get 10 integer and store in array from user and then ask a number again and check whether that number is in the array or not");

		System.out.println();
		int array02[]= new int[10];

		System.out.println("Give the Array Elements : ");
		System.out.println();

		for(int i=0; i<array02.length; i++){
			array02[i]=sc.nextInt();
		}

		System.out.println("Enter the number that to be checked whether it is in the array or not : ");
		System.out.println();

		int number02=sc.nextInt();
		System.out.println();

		int count02=0;

		for(int i=0; i<array02.length; i++){
			if(array02[i]==number02){
				count02++;
			}
		}

		if(count02>0){
			System.out.println("The number "+number02+" is present in the array");
		}

		else{
			System.out.println("The number "+number02+" is not present in the array");
		}

		System.out.println();
		System.out.println();

		System.out.println("3. Take 20 integer from user and put them in an array and then check no. of positive num, negative num, odd num, even num, and 0's");
		System.out.println();

		int array03[]= new int[20];

		System.out.println("Give the Array Elements : ");
		System.out.println();

		for(int i=0; i<array03.length; i++){
			array03[i]=sc.nextInt();
		}
		System.out.println();

		int positive=0;
		int negative=0;
		int even=0;
		int odd=0;
		int zero=0;

		for(int i=0; i<array03.length; i++){
			if(array03[i]>0){
				positive++;
			}
			else{
				negative++;
			}

			if(array03[i]%2==0){
				even++;
			}
			else{
				odd++;
			}

			if(array03[i]==0){
				zero++;
			}
		}
		System.out.println("Number of positive numbers in the array : "+positive);
		System.out.println();
		System.out.println("Number of negative numbers in the array : "+negative);
		System.out.println();
		System.out.println("Number of even numbers in the array : "+even);
		System.out.println();
		System.out.println("Number of odd numbers in the array : "+odd);
		System.out.println();
		System.out.println("Number of zero in the array : "+zero);
		
		System.out.println();
		System.out.println();

		System.out.println("4. Take 10 integer input from user and store in the array then copy all elements in another array by reverse order");

		int array04[]= new int[10];

		System.out.println();
		System.out.println("Give the Array Elements : ");
		for(int i=0; i<array04.length; i++){
			array04[i]=sc.nextInt();
		}

		System.out.println();
		System.out.println("Array Elements are : ");
		System.out.println();

		for(int i=0; i<array04.length; i++){
			System.out.print(array04[i]+"\t");
		}

		System.out.println();
		int newarray04[]=new int[array04.length];

		System.out.println("New array with reverse of old array are : ");
		System.out.println();

		for(int i=0, j=9; i<newarray04.length; i++,j--){
			newarray04[i]=array04[j];
		}
		for(int i=0; i<newarray04.length; i++){
			System.out.print(newarray04[i]+"\t");
		}
		System.out.println();

		System.out.println();
		System.out.println("5. Check wheather the elements of the array are same when it is read from front or back");
		System.out.println();

		System.out.println("Enter the number of arrays to be placed in an array");
		System.out.println();

		int n=sc.nextInt();
		int array05[]=new int[n];

		System.out.println("Give the array elements");
		System.out.println();
		if(n>=0){
			for(int i=0; i<n; i++){
			array05[i]=sc.nextInt();
		}
		System.out.println();

		for(int i=0; i<n; i++){
			System.out.println(array05[i]+"\t");
		}
		System.out.println();

		int diff=0;

		for(int i=0, j=(n-1); i<n; i++,j--){
			if(array05[i]!=array05[j]){
				diff++;
			}
		}
		if(diff>0){
			System.out.println("The array elements are not same when read from front or back");
		}
		else{
			System.out.println("The array elements are same when read from front or back");
		}
		}
		else{
			System.out.println("Enter Valid Number of Elements of an array");
		}
	}
}