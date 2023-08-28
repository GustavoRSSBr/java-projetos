

public interface Nadador extends Animal {

    default void nadar() {
        System.out.println("Nadando");
    }

}
