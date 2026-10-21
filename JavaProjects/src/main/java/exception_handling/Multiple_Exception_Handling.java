package exception_handling;

public class Multiple_Exception_Handling
{

	public static void main(String[] args) 
	{
		
		try
		{
			int a[]=new int[6];
			a[6]=7/0; //both arithmetic and array index out of bound exception is in this line. but it will show only arithmetic because first "7/0" is done. 
		}
		catch(ArrayIndexOutOfBoundsException b)
		{
			System.out.println(b);
		}
		catch(ArithmeticException c)
		{
			System.out.println(c);
		}
	
	/*	catch(Exception d)
		{
			System.out.println(d);
		}
	*/
	}

}
//even if we don't specify/know the exact exception, we can use the parent class "Exception" so that we can avoid the multiple catch.