package super_keyword1;

public class Child extends Parent{

	public static void main(String[] args) 
	{
		Child c = new Child();
		c.method1();
	}
	public void method1()
	{
		super.method1();
		System.out.println("This is child class method");
	}

}
