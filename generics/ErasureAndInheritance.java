package generics;

class GenericBase<T>{
	private T element;
	public void set(T arg) {element = arg;}
	public T get() {return element;}
}

class Derived<T> extends GenericBase<T>{}

class Derived2 extends GenericBase{} //No warning

//class Derived3 extends GenericBase<?>{}

public class ErasureAndInheritance {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Derived2 d2 = new Derived2();
		Object obj = d2.get();
		d2.set(obj); //Warning here!
	}
}
