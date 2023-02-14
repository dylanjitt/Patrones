package practicaCambioMonedaSingleton;

public class Launcher {
	public static void main(String[] args) {
		
		BancoCentral bci = BancoCentral.getInstance();
		CuentaBancaria cuenta = CuentaBancaria.getInstance();
		
		Banco banco = new Banco(bci,cuenta);
		CasaDeCambios casa = new CasaDeCambios(bci,cuenta);
		LibreCambista libre = new LibreCambista(bci,cuenta);
		
		banco.bolivianosDolares(70);
		casa.bolivianosDolares(70);
		libre.bolivianosDolares(70);
		System.out.println("---------------------");
		banco.bolivianosDolares(70);
		casa.dolaresBolivianos(10);
		libre.eurosBolivianos(1);
		
		
	}

}
