public class Generics {

	public static void main(String[] args) {
		String a = "a";
		String b = "b";
		System.out.println("Maior entre a e b: " + maior(a, b));
	}

	private static String maior(String primeira, String segunda) {

		int resultado = primeira.compareTo(segunda);
		if (resultado < 0) {
			return segunda;
		} else {
			return primeira;
		}
	}
}