package oopsConcept;

public class TesterTestcases implements DemoInterface
{

	
	public void meth1() {
		System.out.println("this is meth1");
		
	}

	
	public void meth2() {
		
		System.out.println("this is meth2");
	}

	
	public void meth3() {
		System.out.println("this is meth3");
		
	}

	public static void main(String[] args) {
		TesterTestcases ttc = new TesterTestcases();
		ttc.meth1();
		ttc.meth2();
		ttc.meth3();
	}
	
}
