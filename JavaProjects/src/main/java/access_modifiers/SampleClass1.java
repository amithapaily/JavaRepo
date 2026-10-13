//pgm to show private and protected access modifiers
//protected methods requires inheritance so Modifier_protected class is extended here.
package access_modifiers;

public class SampleClass1 extends Modifier_protected{

	public static void main(String[] args) {
		Modifier_private s=new Modifier_private();
		//commenting below line because it will error out since private method of "Modifier_Private"class won't be accessible from another class.
		//s.method1();
		
		//below code is to create an object reference of child class to call a protected method
		SampleClass1 n =new SampleClass1();
		n.method1();
		
		//below code is to call a default method from a different class in same package
		Modifier_default q=new Modifier_default();
		q.method1();
		

	}

}
