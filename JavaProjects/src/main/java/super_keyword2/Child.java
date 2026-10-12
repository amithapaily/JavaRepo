package super_keyword2;

public class Child extends Parent
{
	public Child()
	{
		super();
		System.out.println("This is child class constructor");
	}

	public static void main(String[] args) 
	{
		Child c=new Child();
	}

}
