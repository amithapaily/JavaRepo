package hierarchical_inheritance;

public class Child_1 extends Parent
{

	public static void main(String[] args) 
	{
		Child_1 c1=new Child_1();
		c1.display();
		c1.display1();

	}

	public void display1()
	{
		System.out.println("Hello from child 1");
	}
}
