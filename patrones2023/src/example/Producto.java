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
	
	private synchronized static void create() {
		if (instance==null)
			instance= new Producto("chocolate",15);
	}
	
	public static Producto getInstance() {
		if (instance==null)
			create();
		return instance;
		
	}
	
	public synchronized void descuento(int newPrecio) {
		precio=newPrecio;
			System.out.println("Precio de oferta de "+name+ ": "+precio);
	}
	
	public void precio() {
		System.out.println("Precio de "+name+" :"+precio);
	}
}
