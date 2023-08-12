
public class Aceleracao {

	private double forca;
	private double massa;

	public Aceleracao(double forca, double massa) {
		this.forca = forca;
		this.massa = massa;
	}

	public void calcularAceleracao() {
		double aceleracao = forca / massa;
		System.out.println("O objeto tem uma aceleração de " + aceleracao + "m/s²");
	}

}
