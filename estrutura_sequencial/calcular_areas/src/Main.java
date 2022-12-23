import java.util.Locale;
import java.util.Scanner;

public class Main {
	/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
	mostre: 
	a) a área do triângulo retângulo que tem A por base e C por altura. 
	b) a área do círculo de raio C. (pi = 3.14159) 
	c) a área do trapézio que tem A e B por bases e C por altura. 
	d) a área do quadrado que tem lado B. 
	e) a área do retângulo que tem lados A e B.
	*/

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double a, b, c;
		double areaCirculo, areaTriangulo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		System.out.println("Digite o valor de A");
		a = scan.nextDouble();
		System.out.println("Digite o valor de B");
		b = scan.nextDouble();
		System.out.println("Digite o valor de C");
		c = scan.nextDouble();
		
		areaTriangulo = a * c / 2;
		areaCirculo = 3.14159 * Math.pow(c, 2);
		areaTrapezio = ((a + b) /2) * c;
		areaQuadrado = b * b;
		areaRetangulo = a * b;
		
		System.out.printf("a) a área do triângulo retângulo que tem %.1f por base e %.1f por altura é igual à %.3f%n", a, c, areaTriangulo);
		System.out.printf("b) a área do círculo de raio %.1f é igual à %.3f%n", c, areaCirculo);
		System.out.printf("c) a área do trapézio que tem %.1f e %.1f por bases e %.1f por altura é igual à %.3f%n", a, b, c, areaTrapezio);
		System.out.printf("d) a área do quadrado que tem lado %.1f é igual à %.3f%n", b, areaQuadrado);
		System.out.printf("e) a área do retângulo que tem lados %.1f e %.1f é igual à %.3f%n", a, b, areaRetangulo);
		
		scan.close();

	}

}
