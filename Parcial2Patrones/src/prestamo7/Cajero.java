package prestamo7;

public class Cajero implements Ihandler{
	private Ihandler next;

	@Override
	public void setNext(Ihandler handler) {
		next=handler;
		
	}

	@Override
	public Ihandler next() {
		return next;
	}

	@Override
	public void prestamo(Prestamo prestamo, int monto) {
		
		System.out.println("-----------------------------------------------");
		System.out.println("Prestamo del monto: "+monto+" Bs.");
		
		AgenteDeCredito agente = new AgenteDeCredito();
		Supervisor supervisor = new Supervisor();
		EncargadoDePrestamos encargado = new EncargadoDePrestamos();
		
		this.setNext(agente);
		agente.setNext(supervisor);
		supervisor.setNext(encargado);
		
		
		
		if (prestamo.getPercentage()<25) {
			
			prestamo.info();
			System.out.println("Pago recibido por el CAJERO");
		}else {
			this.next.prestamo(prestamo, monto);
		}
		
		
	}

}
