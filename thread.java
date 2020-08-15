class Mythread extends Thread
{
	public void start()
	{
		super.start();
		System.out.println("Hello 1");
	}
	public void run()
	{
		System.out.println("Hello 2");
	}
}

class Mythread2 extends Thread
{
	public void run()
	{
		System.out.println("Hello 2");
	}
}

class thread
{
	public static void main(String args[])
	{
		Mythread m1=new Mythread();
		m1.start();
	  Mythread2 m2=new Mythread2();
		m2.start();
	}
}
