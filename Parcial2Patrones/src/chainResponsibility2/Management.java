package chainResponsibility2;

public class Management implements Ihandler {
	
	private Ihandler next;

	@Override
	public void setNext(Ihandler handler) {
		next = handler;
	}

	@Override
	public Ihandler next() {
		return next;
	}

	@Override
	public void orderReport(Orden orden) {
		General g = new General();
		Teniente t = new Teniente();
		Coronel co = new Coronel();
		Cabo ca = new Cabo();
		
		this.setNext(g);
		g.setNext(t);
		t.setNext(co);
		co.setNext(ca);
		
		this.next.orderReport(orden);
		
	}

}
