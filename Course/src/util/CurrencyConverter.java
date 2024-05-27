package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	
	public static double valueInReal(double dollar,double quota) {
		return (dollar * IOF + dollar) * quota  ;
	}

}
