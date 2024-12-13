package basicJava;

public class Revision
{

	public void printVal()
	{
		System.out.println("This is one method");
	}
	
	public Revision()
	{
		System.out.println("this is constructor");
	}
	
	public Revision(int x)
	{
		System.out.println("this is constructor");
	}
	
	public static void main(String[] args) 
	{
		Revision rev = new Revision();
		rev.printVal();
		
	}
	
}
