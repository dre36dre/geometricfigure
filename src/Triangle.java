
public class Triangle extends Figure {
	private double base, altura;
	
public 	Triangle() {
	
}

public Triangle(String cor,double base, double altura) {
	super(cor);
	this.base = base;
	this.altura = altura;
}

public double getBase() {
	return base;
}

public void setBase(double base) {
	this.base = base;
}

public double getAltura() {
	return altura;
}

public void setAltura(double altura) {
	this.altura = altura;
}

@Override
public double area() {
	return altura * base;
}

@Override
public String toString() {
	return "Triangle [base=" + base + ", altura=" + altura + ", getBase()=" + getBase() + ", getAltura()=" + getAltura()
			+ ", area()=" + area() + "]";
}





}
