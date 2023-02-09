package singleton;

public class ClientExample {

	public static void main(String[] args)throws InterruptedException {
		Thread s1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Sucursal sucursalA= new Sucursal(new Client("Diego"));
				sucursalA.retirarDinero(100);
				
			}
		});
		
		Thread c1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Cajero cajero= new Cajero(new Client("Diego"));
				cajero.retirarDinero(200);
			}
		});
		
		Thread app = new Thread(new Runnable() {
			
			@Override
			public void run() {
				WebApp webapp= new WebApp(new Client("Diego"));
				webapp.retirarDinero(300);
			}
		});
		
		s1.start();
		c1.start();
		app.start();
		Thread.sleep(2000);
		CuentaBancaria.getInstance().saldoActual();

	}

}
