class Vowels 
{
	public static void main(String[] args) 
	{
		StringBuilder str= new StringBuilder("Hi I am Learning Java");
		System.out.println(str);
		int count=0;
		str.toLowerCase();
		for (int i=0; i<=str.length(); i++)
		{
			if(str.charAt(i)== 'a' || str.charAt(i)==  'e' || str.charAt(i)==  'i' || str.charAt(i)==  'o' || str.charAt(i)==  'u'){
				count++;
			}
		}
		System.out.println("Number of Vowels in the Strings is : "+count);
	}
}
