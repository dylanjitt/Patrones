package SegundoParcial;

import java.util.function.Function;

public class P3ej6 {
	public static void main(String[] args) {
		
		Productos carne = new Productos("Carne molida", 45.5);
		
		Function<Double, Double> discount1 = (a) -> a-(a/10);
		
		Function<Double, Double> discount2 = (a) -> a-10;
		
		Function<Double, Double> discount = discount1.andThen(discount2);
		
		Function<Double, Integer> redondeo = (a)-> castDouble(a);
		
		Function<Double, Integer> operation = discount.andThen(redondeo);
		
		carne.applyFunction(operation);
		
		System.out.println(carne);
		
	}
	
	public static int castDouble (double d) {
		return(int)d;
	}

}
