

public class Galinha implements Animal, Voador {

    @Override
    public void voar() {
        System.out.println("Planando");
    }

    @Override
    public void movimentar() {
        System.out.println("Ciscando");
    }
}
