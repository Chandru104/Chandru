class StringDemo02 
{
	public static void main(String[] args) 
	{
		//StringBuilder str= new StringBuilder("Ravi S.");
		//System.out.println(str);
		//str.append(" "+"Prasad");
		//System.out.println(str);
		StringBuilder sb= new StringBuilder("abcabc");
		System.out.println("Original String : "+sb);
		char rev= sb.reverse();
		System.out.println("Reversed String : "+rev);
		if(sb==rev){
			System.out.println("It is Palindrome");
		}
		else{
			System.out.println("It is not Palindrome");
		}
		for(int i=0; i<=sb.length(); i++){
			if(sb.charAt(i) == c){
				sb.delete(sb.length(i));
			}
		}
		System.out.println(sb);
	}
}
