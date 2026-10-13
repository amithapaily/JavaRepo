//pgm to check if a public method of a package(access_modifiers) can be called from another package(hierarchical_inheritance).
package hierarchical_inheritance;

import access_modifiers.Modifier_public;

public class Sample {

	public static void main(String[] args) {
		Modifier_public b=new Modifier_public();
		b.method();

	}

}
