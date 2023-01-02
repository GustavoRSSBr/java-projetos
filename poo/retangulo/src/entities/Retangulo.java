package entities;

public class Retangulo {

	public double altura;
	public double largura;

	public double calcularArea() {
		return altura * largura;
	}

	public double calcularPerimetro() {
		return 2 * (altura + largura);
	}

	public double calcularDiagonal() {
		return Math.sqrt((Math.pow(largura, 2) + Math.pow(altura, 2)));
	}

}
