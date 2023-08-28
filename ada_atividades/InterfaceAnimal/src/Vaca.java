
public class Vaca implements Amamentador {

	@Override
	public void movimentar() {
		System.out.println("Pastando");
	}

	@Override
	public void amamentar() {
		System.out.println("amamentando");
	}
}
