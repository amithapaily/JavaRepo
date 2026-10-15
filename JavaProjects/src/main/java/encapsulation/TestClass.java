package encapsulation;

public class TestClass {
	
	private int a;
	private int b;

	public static void main(String[] args) {
		
		TestClass t=new TestClass();
		t.setValue(10, 20);
		t.getValue();
	}
	
	public void setValue(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void getValue()
	{
		System.out.println("Value of a is: "+a);
		System.out.println("Value of b is: "+b);
	}

}
