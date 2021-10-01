class Student 
{
	String name;
	Student(){
		System.out.println("Unknown");
	}
	Student(String name){
		this.name=name;
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		Student obj1= new Student("Chandru");
		Student obj2=new Student();
	}
}
