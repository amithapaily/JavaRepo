package polymorphism;

public class MethodOverriding_Child extends MethodOverriding_Parent
{

	public static void main(String[] args) 
	{
		MethodOverriding_Child c= new MethodOverriding_Child();
		c.method1();
		//below code is upcasting
		MethodOverriding_Parent p=new MethodOverriding_Child();
		p.method1();

	}
	public void method1()
	{
		//Below is calling parent class method using super keyword. THis can be done either by upcsating or using super keyword.
		//super.method1();
		System.out.println("This is child class method");
	}

}
