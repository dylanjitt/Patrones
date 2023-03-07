package chainResponsibility2;

public class General implements Ihandler {
	
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
		if (orden.getName().equals("Entrevistas")) {
			orden.show();
			System.out.println("GENERAL");
		}else {
			next.orderReport(orden);
		}
		
	}

}
