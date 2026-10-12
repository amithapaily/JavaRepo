package multilevel_inheritance;

public class Child extends Parent
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Child c=new Child();
		c.method3();
		c.method2();
		c.method1(10,20);
	}
	public void method3()
	{
		System.out.println("Hello from Child");
	}

}
