
public class Golfinho implements Nadador, Amamentador {

    @Override
    public void movimentar() {
        nadar();
    }
    
    @Override
    public void amamentar() {
        System.out.println("amamentando");
    }

}
