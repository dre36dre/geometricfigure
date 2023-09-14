
public class Square extends Rectangle {
	
	public Square() {
		super();
	}
	public Square(String cor,double side1,double side2) {
		super(cor,side1,side2);
	}
	
	public Square(String cor, double side) {
		side=super.getSide1();
	}

	@Override
	public double area() {
		return this.getSide1()*this.getSide1();
	}
	@Override
	public String toString() {
		return "Square [area()=" + area() + ", cor="+super.getCor()+"]";
	}
	
}
