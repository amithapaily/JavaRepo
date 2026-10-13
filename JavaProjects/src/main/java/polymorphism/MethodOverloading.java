package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading m= new MethodOverloading();
		m.display();
		m.display(10, 20);
		m.display("Hello All");

	}
	public void display()
	{
		System.out.println("This is the first method");
	}
	public void display(int a, int b)
	{
		int c=a+b;
		System.out.println("This is to display sum. Sum is : "+c);
	}
	public void display(String a)
	{
		System.out.println("This is to display the string: "+a);
	}

}
