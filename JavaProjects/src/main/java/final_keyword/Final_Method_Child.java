package final_keyword;

public class Final_Method_Child extends Final_Method_Parent
{

	public static void main(String[] args) 
	{
		
	}
	//below code will error out since "final" method "display" cannot be overrided in child class
	/*
	public void display() 
	{
		System.out.println("This is from child class");
	}
	*/

}
