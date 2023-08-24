package listaEmOrdemAlfabetica;

import java.util.ArrayList;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		ArrayList <String> lista = new ArrayList<String>();
		
		lista.add("Gustavo");
		lista.add("Amanda");
		lista.add("Larissa");
		
		System.out.println("Lista Desordenada: ");
		
		System.out.println(lista);
		
	
		Collections.sort(lista);
		System.out.println();
		
		
		System.out.println("Lista Ordenada: ");
		System.out.println(lista);

	}

}
