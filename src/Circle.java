public class Circle extends Figure {
	private double raio;
	
	
	public Circle() {
		
	}

	public Circle(String cor,double raio) {
		super(cor);
		this.raio=raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area() {
		return raio * 3.14 *2;
	}

	@Override
	public String toString() {
		return "Circle [raio=" + raio + ", getRaio()=" + getRaio() + ", area()=" + area() + "]";
	}
	
	
	

}
