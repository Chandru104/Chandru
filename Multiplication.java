class Num
	{
	void MulNum(){
		int num=17;
		for (int i=1; i<=10;i++)
		{
			System.out.println(num*i +"\n");
		}
	}
}

class Multiplication
	{
	public static void main(String[] args) 
	{
		Num n= new Num();
		n.MulNum();
	}
}