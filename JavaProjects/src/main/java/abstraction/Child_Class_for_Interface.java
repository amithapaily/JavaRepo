package abstraction;

public class Child_Class_for_Interface implements Interface_Parent{

	public static void main(String[] args) 
	{
		Child_Class_for_Interface c=new Child_Class_for_Interface();
		c.display();
		c.display1();
	}

	@Override
	public void display() 
	{
	System.out.println("This is implementation of abstract method in the interface");	
		
	}
	
	public void display1()
	{
		System.out.println("This is child class method");
	}

}
