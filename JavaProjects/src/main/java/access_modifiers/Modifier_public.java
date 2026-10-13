
//pgm to check accessing a public method from same class.

package access_modifiers;

public class Modifier_public {

	public static void main(String[] args) {
		Modifier_public p=new Modifier_public();
		p.method();
			
	}

	public void method()
	{
		System.out.println("This is method");
	}
}
