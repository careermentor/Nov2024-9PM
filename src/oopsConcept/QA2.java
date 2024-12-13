package oopsConcept;

public class QA2 extends QA1
{

	int x = 100;
	
	public void printVal()
	{
		final int x = 200;  //constant
		
		//x=300;
		
		System.out.println(x);  //200
		
		System.out.println(this.x);  //100
		
		System.out.println(super.x);  //500
		
		super.sum(20, 30);
	}
	
	
	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("Sum of a&b: " + c);
	}
	
	public void subs(int a, int b)
	{
		int c = a-b;
		System.out.println("subs of a&b: " + c);
		
	}
	
	public static void main(String[] args)
	{
		QA2 q2 = new QA2();
		//q2.subs(20, 30);
		
		//QA1 q21 = new QA1();
		//q2.sum(20, 30);
		//q2.qa1im();
		q2.printVal();
		q2.sum(20, 30);
	}
	
	public static void main(int a)
	{
		System.out.println("this is overloading");
		
	}

	
	public void qa1im() {
		System.out.println("QA1I method");
		
	}
	
}
