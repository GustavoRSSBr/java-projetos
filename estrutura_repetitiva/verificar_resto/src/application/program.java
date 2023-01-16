package application;

public class program {

	public static void main(String[] args) {
		// faça um codigó que verifica a quantidade de números divididos por 7 que tem o
		// resto 3, entre 1 e 300;
		
		
		int ctd = 0;
		
		for (int i = 1; i <= 300; i++) {
			if (i%7 == 3) {
				ctd ++;
			}
		}
		
		System.out.println(ctd);
	}

}
