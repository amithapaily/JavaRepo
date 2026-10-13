//pgm to show protected method can be accessed from a class in different package.
//pgm to show default method in one package cannot be accessed from another package.
package super_keyword2;

import access_modifiers.Modifier_default;
import access_modifiers.Modifier_protected;

public class TestClass extends Modifier_protected{

	public static void main(String[] args) {
		TestClass t=new TestClass();
		t.method1();
		
		
	//	below code is to depict default method in one package cannot be accessed from another package.
		Modifier_default w=new Modifier_default();
		//below code is commented because default method in one package cannot be accessed from another package.
		//w.method1();
	}

}
