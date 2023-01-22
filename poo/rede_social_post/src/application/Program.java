package application;

import java.time.Instant;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		// Desenvolvendo uma classe de post semelhante à utilizada em redes sociais
		// usando o String Builder e a Classe Instant para datas.

		Comment c1 = new Comment("Tenha um belo dia!");
		Comment c2 = new Comment("Isso é tão legal!");

		Post p1 = new Post(Instant.now(), "Viagem De Férias",
				"Hoje eu viajei com a minha familia para Ubatuba, foi divertido!", 10);

		p1.addComent(c1);
		p1.addComent(c2);

		System.out.println(p1);
	}

}
