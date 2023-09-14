
public class Test {
public static void main(String[] args) {
	Square square=new Square();
	Circle circle= new Circle("green",10.5);
	Rectangle rect=new Rectangle("blue",2,4);
	Triangle triangle=new Triangle("Yellow",5,10);
	
	square.setCor("pink");
	square.setSide1(6);
	
	System.out.println(square);
	System.out.println(circle);
	System.out.println(rect);
	System.out.println(triangle);
}
}
