
public class Main {

	public static void main(String[] args) {
		// Testando as funções da String

		String texto = "GUsTavo RodrIgues SAntos SiLVA   ";

		System.out.println(texto);

		String minuscula = texto.toLowerCase(); // Letra Minuscula
		System.out.println("-" + minuscula + "-");

		String maiuscula = texto.toUpperCase(); // Letra Maiuscula
		System.out.println("-" + maiuscula + "-");

		String semEspaco = texto.trim(); // Tira espaços das bordas
		System.out.println("-" + semEspaco + "-");

		String subString = texto.substring(8).trim().toUpperCase(); // recorta passando só o inicio
		System.out.println("-" + subString + "-");

		String subString2 = texto.trim().substring(8, 17); // recorta passando o inidice do inicio e do fim
		System.out.println("-" + subString2 + "-");

		String replace = texto.trim().toUpperCase().replace(' ', '-'); // substitui char
		System.out.println(replace);

		String replaceSub = texto.trim().toUpperCase().replace("SANTOS", "S."); // substitui subString
		System.out.println(replaceSub);

		int posicaoInicio = texto.toUpperCase().trim().indexOf("S"); // retorna a posição inicial da primeira ocorrencia
																		// // do char ou substring
		System.out.println(posicaoInicio);

		int posicaoFinal = texto.toUpperCase().trim().lastIndexOf("S"); // retorna a posição final da primeira //
																		// ocorrencia do char ou substring
		System.out.println(posicaoFinal);

		String[] vetor = texto.trim().toUpperCase().split(" "); // joga as palavras da String separadas por espaço em um
																// vetor

		String primeiroNome = vetor[0];
		String segundoNome = vetor[1];
		String terceiroNome = vetor[2];
		String quartoNome = vetor[3];

		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Segundo nome: " + segundoNome);
		System.out.println("Terceiro nome: " + terceiroNome);
		System.out.println("Quarto nome: " + quartoNome);

	}
}