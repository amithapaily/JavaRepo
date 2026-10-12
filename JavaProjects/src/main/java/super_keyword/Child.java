package super_keyword;//1st use of super keyword- refer immediate parent class instance variable

public class Child extends Parent{
	int x=20;

	public static void main(String[] args) 
	{
		Child c=new Child();
		c.method1();	

	}
	
	public void method1()
	{
		System.out.println(x);//print value of x in Child class ie 20.
		System.out.println(super.x);//print value of x in parent class ie 10.
	}

}
