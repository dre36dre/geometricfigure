
public abstract class Figure {
private String cor;

public Figure() {}

public Figure(String cor) {
	super();
	this.cor = cor;
}

public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}

public abstract double area();


}
