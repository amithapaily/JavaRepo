package exception_handling;

public class Try_Catch_Exceptions {

	public static void main(String[] args) {
			try {
				int a=10;
				int b;
				b=a/0;
				System.out.println("Value of b is : "+b);
			}
			catch(ArithmeticException v)
			{
				System.out.println(v);
			}
			finally
			{
				System.out.println("This is how division by zero is handled");
			}
		}

	}


