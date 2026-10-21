package exception_handling;

public class Throws_Exception 
{

	public static void main(String[] args) throws VotingAgeException
	{
		int age=10;
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			//below "VotingAgeExcepton" is a new exception created by user ie it is not builtin exception in parent class"Exception.
			//hence the string "Invalid voting age" won't be displayed in console while running.
			//so while resolving the errors from the method signature [ public static void main(String[] args) throws VotingAgeException]we need to create a class "VotingAgeException" which is the child class of "Exception"
			//To resolve the error in below line, we need to create a constructor and need to pass the "Invalid voting age" in the super() method.
			throw new VotingAgeException("Invalid voting age");
		}

	}

}
