package access_modifiers;

public class Modifier_protected {

	public static void main(String[] args) {
		Modifier_protected m=new Modifier_protected();
		m.method1();

	}

	protected void method1()
	{
		System.out.println("This is a protected method");
	}
}
