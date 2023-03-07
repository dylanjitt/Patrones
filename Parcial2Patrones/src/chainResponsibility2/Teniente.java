package chainResponsibility2;

public class Teniente implements Ihandler {
	
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
		if (orden.getName().equals("Disciplina")) {
			orden.show();
			System.out.println("TENIENTE");
		}else {
			next.orderReport(orden);
		}
		
	}

}
