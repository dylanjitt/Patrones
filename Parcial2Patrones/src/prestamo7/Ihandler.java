package prestamo7;

public interface Ihandler {
	void setNext(Ihandler handler);
	Ihandler next();
	
	void prestamo(Prestamo prestamo, int monto);

}
