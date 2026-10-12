package single_inheritance;

public class Child extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.method2();  //child's method
		c.method();  //parent's method

	}

	public void method2()
	{
		System.out.println("Hello-from child method");
	}
}
