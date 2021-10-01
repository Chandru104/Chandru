class Pattern
{
	int p2(int a){
		if(a>0){
			for(int i=1; i<=a; i++){
				String c = i+" "+p2(a-1);
			}
		}
		return c;
	}
}

class Task01 
{
	public static void main(String[] args) 
	{
		int n=5;
		System.out.println("Pattern 2");
		Pattern b = new Pattern();
		for(int j=n; j>0; j--){
			b.p2(j);
			n=n-1;
		}
	}
}