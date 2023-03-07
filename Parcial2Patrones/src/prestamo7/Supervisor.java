package prestamo7;

public class Supervisor implements Ihandler{
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
		
		if (prestamo.getPercentage()>50&& prestamo.getPercentage()<100) {
			
			prestamo.info();
			System.out.println("Pago recibido por el SUPERVISOR");
			System.out.println("> Usted tiene habilitada la oportunidad de nuevos prestamos");
		}else {
			this.next.prestamo(prestamo, monto);
		}
		
		
	}

}
