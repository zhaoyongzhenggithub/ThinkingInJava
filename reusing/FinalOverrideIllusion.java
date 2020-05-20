package reusing;

class WithFinals{
	private final void f() {System.out.println("WithFinals.f()");}
	private void g() {System.out.println("WithFinals.g()");}
}

class OverriingPrivate extends WithFinals{
	private final void f() {
		System.out.println("OverriingPrivate.f()");
	}
	private void g() {
		System.out.println("OverriingPrivate.g()");
	}
}

class OverriingPrivate2 extends OverriingPrivate{
	public final void f() {
		System.out.println("OverriingPrivate2.f()");
	}
	public void g() {
		System.out.println("OverriingPrivate2.g()");
	}
}
public class FinalOverrideIllusion {
	public static void main(String[] args) {
		OverriingPrivate2 oop2=new OverriingPrivate2();
		oop2.f();
		oop2.g();
		OverriingPrivate op=oop2;
		WithFinals wf=oop2;
	}
}
