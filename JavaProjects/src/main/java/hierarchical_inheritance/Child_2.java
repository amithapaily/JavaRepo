package hierarchical_inheritance;

public class Child_2 extends Parent{

	public static void main(String[] args) 
	{
		Child_2 c2=new Child_2();
		c2.display();
		c2.display2();

	}

	public void display2()
	{
		System.out.println("Hello from child 2");
	}

}
