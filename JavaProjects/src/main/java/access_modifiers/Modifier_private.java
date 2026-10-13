package access_modifiers;

public class Modifier_private {

	public static void main(String[] args) {
		Modifier_private p=new Modifier_private();
		p.method1();

	}

	private void method1()
	{
		System.out.println("This is a private method");
	}
}
