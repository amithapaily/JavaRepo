//pgm to check accessing a public method from another class of same package.
package access_modifiers;

public class SampleClass {

	public static void main(String[] args) {
		Modifier_public a= new Modifier_public();
		a.method();

	}

}
