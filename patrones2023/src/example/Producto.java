package example;

import singleton.CuentaBancaria;

public class Producto {
	private static Producto instance = null;
	private String name;
	public int getPrecio() {
		return precio;
	}

	private int precio;
	
	public Producto(String name, int precio) {
		this.name = name;
		this.precio = precio;
	}
	
	public void precio() {
		System.out.println("Precio de "+name+" :"+precio);
	}
}
