public interface Amamentador extends Animal {


    default void amamentar() {
        System.out.println("amamentando");
    }

}
