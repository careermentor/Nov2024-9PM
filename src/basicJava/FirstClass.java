package basicJava;

 public class FirstClass
{
	int a = 100;  //global variable
	//a=200;
	
	 public void printdata()
	{
		final int a=10;  //local variable
		//a=20;
		float b = 10.5f;
		char c = 'X';
		String d = "xyz";
		boolean e = false;
		
		System.out.println(a);  //10
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

	 void printVal_a()
	{
		System.out.println(a);  //100
	}
	
	public static void main(String[] args) 
	{
		FirstClass abc = new FirstClass();
		abc.printdata();
		abc.printVal_a();
		
		
		DemoStaticKeyword.val();
	}
}
