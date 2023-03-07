package chainResponsibility2;

public class Coronel implements Ihandler {
	
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
		if (orden.getName().equals("Desbloqueos") || orden.getName().equals("Manifestaciones")) {
			orden.show();
			System.out.println("CORONEL");
		}else {
			next.orderReport(orden);
		}
		
	}

}
