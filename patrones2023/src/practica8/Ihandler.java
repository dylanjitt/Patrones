package practica8;

public interface Ihandler {
	
	void setNext(Ihandler handler);
	Ihandler next();
	
	void fallaReport(Falla falla);

}
