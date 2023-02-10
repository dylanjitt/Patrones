package example;

import singleton.CuentaBancaria;

public class Logger {
	
	private static Logger instance = null;
	
	private synchronized static void create() {
		if (instance==null)
			instance= new Logger("chocolate",15);
	}
	
	public static Logger getInstance() {
		if (instance==null)
			create();
		return instance;
		
	}
	
	public synchronized void descuento(int newPrecio) {
		precio=newPrecio;
			System.out.println("Precio de oferta de "+name+ ": "+precio);
	}
}
