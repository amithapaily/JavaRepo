package aggregation;

public class Student {
	
	int x;
	int y;
	School s;//aggregation- giving an entity reference of another class in this class.

	public static void main(String[] args) 
	{
		School z= new School();// creating obj ref for School class inorder to pass the value for the arguments in the method1()
		z.method1(10, 20);
		Student t=new Student();
		t.method2(30, 40, z);
		t.display();

	}
	public void method2(int x, int y, School s)
	{
		this.x=x;
		this.y=y;
		this.s=s;
	}
	public void display()
	{
		System.out.println("Value of x is: "+x);
		System.out.println("Value of y is: "+y);
		System.out.println("Value of a is: "+s.a);
		System.out.println("Value of b is: "+s.b);
	}

}
