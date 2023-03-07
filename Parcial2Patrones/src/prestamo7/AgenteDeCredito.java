package prestamo7;

public class AgenteDeCredito implements Ihandler{
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
		
		if (prestamo.getPercentage()>=25&&prestamo.getPercentage()<=50) {
			
			prestamo.info();
			System.out.println("Pago recibido por el AGENTE DE CREDITO");
			System.out.println("> usted tiene la oportunidad de refinanciar su prestamo");
		}else {
			this.next.prestamo(prestamo, monto);
		}
		
	}

}
