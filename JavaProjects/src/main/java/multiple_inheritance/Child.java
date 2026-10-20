package multiple_inheritance;

public class Child implements Interface_Parent1,Interface_Parent2{

	public static void main(String[] args) 
	{
		Child c=new Child();
		c.display1();
		c.display2();
		c.display3();
	}

	@Override
	public void display2() 
	{	
		System.out.println("This is the implementation of display2 method from 2nd parent interface");
	}

	@Override
	public void display1() 
	{
		System.out.println("This is the implementation of display1 method from 1st parent interface");
	}
	public void display3()
	{
		System.out.println("This is from child class method");
	}

}
 