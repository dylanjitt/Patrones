package SegundoParcial;

import java.util.function.Function;

public class Productos {
	String nombre;
	int precio;
	
	public Productos(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = (int)precio;
	}
	
	@Override
	public String toString() {
		return "Producto: {"+nombre+", Bs."+precio+"}";
	}
	
	public void applyFunction(Function<Double, Integer> operador) {
		this.precio = operador.apply((double) precio);
	}
}
