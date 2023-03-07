package chainResponsibility2;

public interface Ihandler {
	
	void setNext (Ihandler handler);
	Ihandler next();
	
	void orderReport (Orden orden);

}
