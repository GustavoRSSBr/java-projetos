

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Pessoa> listaDeNomes = new ArrayList<>(
				List.of(new Pessoa("Carlos", "Gerente"), new Pessoa("Ana", "chefe")));

		Comparator<Pessoa> comparaNomeCargo = Comparator.comparing(Pessoa::getNome, String.CASE_INSENSITIVE_ORDER);
		Collections.sort(listaDeNomes, comparaNomeCargo);

		System.out.println(listaDeNomes);
	}

}
