package primerParcial;

import java.util.ArrayList;
import java.util.List;

public class UPBPF {
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println();
		
		List<Double> precios = new ArrayList<>();
		precios.add((double)100);
		precios.add((double)45);
		precios.add((double)200);
		precios.add((double)350);
		precios.add((double)400);
		
		System.out.println("El precio total del carrito es:"+totalCarritoCompras(precios, 10, 13));
		
	}

	public static Double totalCarritoCompras(List<Double> precios, double descuento, double iva) {
		
		// TODO Auto-generated method stub
		return null;
	}

}
