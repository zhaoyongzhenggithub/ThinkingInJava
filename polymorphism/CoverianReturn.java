package polymorphism;

class Grain{
	public String toString() {return "Grain";}
}

class Wheat extends Grain{
	public String toString() {return "Wheat";}
}

class Mill{
	Grain process() {return new Wheat();}
}

class WheatMill extends Mill{
	Wheat process() {return new Wheat();}
}
public class CoverianReturn {
	public static void main(String[] args) {
		Mill m=new Mill();
		Grain g=m.process();
		System.out.println(g);
		m=new WheatMill();
		g=m.process();
		System.out.println(g);
		
	}
}
