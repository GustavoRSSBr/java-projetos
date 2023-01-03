package utils;

public class CurrencyConverter {
	
	public static double iof = 1.06; 

	public static double converter(double qtdDolar, double valorDolar) {
		return qtdDolar * valorDolar * iof;
	}

}
