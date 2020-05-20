package reusing;

class Shape{
	Shape(int i){System.out.println("Shape constructor");}
	void dispose() {System.out.println("Shape dispose");}
}

class Circle extends Shape{
	Circle(int i){
		super(i);
		System.out.println("Drawing Circle");
	}
	
	void dispose() {
		System.out.println("Erasing Circle");
		super.dispose();
	}
}

class Triangle extends Shape{
	Triangle(int i){
		super(i);
		System.out.println("Drawing Triangle");
	}
	void dispose() {
		System.out.println("Erasing Triangle");
		super.dispose();
	}
}

class Line extends Shape{
	private int start,end;
	Line(int start,int end){
		super(start);
		this.start=start;
		this.end=end;
		System.out.println("Drawing Line:"+start+","+end);
	}
	void dispose() {
		System.out.println("Erasing Line:"+start+","+end);
		super.dispose();
	}
}

public class CDASystem extends Shape{
	private Circle c;
	private Triangle t;
	private Line[] lines=new Line[3];
	public CDASystem(int i) {
		super(i+1);
		for(int j=0;j<lines.length;j++) {
			lines[j]=new Line(j,j*j);
		}
		c=new Circle(1);
		t=new Triangle(1);
		System.out.println("Combined Constructor");
	}
	
	public void dispose() {
		System.out.println("CADSyste.dispose()");
		t.dispose();
		c.dispose();
		for(int i=lines.length-1;i>=0;i--) {
			lines[i].dispose();
		}
		super.dispose();
	}
	
	public static void main(String[] args) {
		CDASystem x=new CDASystem(47);
		try {
			
		}finally {
			x.dispose();
		}
	}
}
