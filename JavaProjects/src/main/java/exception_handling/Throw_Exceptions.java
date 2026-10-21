package exception_handling;

public class Throw_Exceptions 
{

	public static void main(String[] args) 
	{
		int age=10;
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			throw new ArithmeticException("Not eligible for voting");
		}

	}

}
