package abstraction;

public abstract class Parent 
{
	//abstract method. it doesn't have the {...} part because abstract method doesn't have implementation part
	public abstract void method();
	
	//instance method
	public void display()
	{
		System.out.println("This is from instance method of an abstract class");
	}
}
