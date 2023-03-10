package singleton;

public class CuentaBancaria {
	
	private static CuentaBancaria instance = null;
	private int saldo;
	
	public CuentaBancaria() {
		saldo = 1000;
		System.out.println("INFO > Saldo inicial: "+saldo);
	}
	
	private synchronized static void create() {
		if (instance==null)
			instance= new CuentaBancaria();
	}
	
	public static CuentaBancaria getInstance() {
		if (instance==null)
			create();
		return instance;
		
	}
	
	public synchronized void retirarDinero(int amount) {
		if(amount <= saldo) {
			saldo=saldo-amount;
			System.out.println("INFO > el monto de "+amount+" fue retirado exitosamente, saldo restante: "+saldo);
		}else {
			System.out.println("ERROR > no se pudo retirar la cantidad solicitada, es mayor a su saldo actual: "+saldo);
		}
	}
	
	public void saldoActual() {
		System.out.println("INFO > tu saldo es: "+saldo);
		
	}
	
	

}
