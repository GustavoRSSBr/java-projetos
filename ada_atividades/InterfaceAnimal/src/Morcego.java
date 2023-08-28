
public class Morcego implements Voador, Amamentador {

	@Override
	public void voar() {
		System.out.println("Voando");
	}

	@Override
	public void movimentar() {
		voar();
	}

	@Override
	public void amamentar() {
		System.out.println("amamentando");
	}
}
