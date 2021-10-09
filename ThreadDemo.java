class ThreadDemo extends Thread
{
	public void run(){
		for(int i=1; i<6; i++){
			System.out.println("The thread "+i+" is running");
		}
	}
	public static void main(String[] args) 
	{
		ThreadDemo obj = new ThreadDemo();
		obj.start();
		System.out.println(obj.getName());
		System.out.println(obj.isAlive());
	}
}