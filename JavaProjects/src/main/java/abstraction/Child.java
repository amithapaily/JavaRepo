package abstraction;

public class Child extends Parent{

	public static void main(String[] args) 
	{
		Child c=new Child();
		c.method();
		c.display();
		c.display1();
	}
	// below overriden method calls the abstract method from parent class and its implementation.
	//ie the code inside braces is given in this child class.
	//This is to achieve abstraction.
	@Override
	public void method() 
	{
		System.out.println("This is abstract method overrided from parent class");
		
	}
	public void display1()
	{
		System.out.println("This is an instance method of the child class");
	}

}
