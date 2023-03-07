package prestamo7;

public class EncargadoDePrestamos implements Ihandler{
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

		if (prestamo.getPercentage()==100) {
			
			prestamo.info();
			System.out.println("Pago recibido por el ENCARGADO DE PRESTAMOS");
			System.out.println("> Se procede a la devolucion de documentos");
		}else {
			System.out.println("ERROR: > PORCENTAJE FUERA DE RANGO");
		}
		
	}

}
