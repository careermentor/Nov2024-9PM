package basicJava;

public class Calculations 
{
	
	public int testmth()
	{
		//char a = 'X';
		//String b = "Java";
		
		int a = 20;
		int b = 30;
		int c = a+b;
		return a;
		
	}
	
	
	public Calculations()
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		
		System.out.println("Const - is sum of a&b: " + c);
		
	}
	
	public Calculations(int a)
	{
		
		int b = 30;
		int c = a+b;
		
		System.out.println("Const - is sum of a&b: " + c);
		
	}
	
	public Calculations(int a, int b)
	{
		int c = a+b;
		System.out.println("const out: " + c);
	}

	public int sum()
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		
		System.out.println("This is sum of a&b: " + c);
		return c;
	}
	
	public int add(int a, int b)
	{
		int c = a+b;
		System.out.println("value of c: " + c);
		//return c;
		return c;
	}
	
	//10+20+30
	//x=10+20
	//x+30
	
	public static void main(String[] args) 
	{
	
		Calculations cal = new Calculations(); 
		
		Calculations cal1 = new Calculations(40, 50); 
		
		cal.sum();
		cal.add(30, cal.sum());
		
		int x = cal.add(10, 20);
		cal.add(x, 30);
		
	}
	
}
