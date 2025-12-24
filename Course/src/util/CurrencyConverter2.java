package util;

public class CurrencyConverter2 {

	public static double priceDollar;
	public static final double iof = 0.06;
	public static double dollar;

	public static double calcReal() {
		return iof * dollar * priceDollar;
	}

}
