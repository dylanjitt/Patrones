package chainResponsibility2;

public class Cabo implements Ihandler {
	
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
		if (orden.getName().equals("Limpiezas")) {
			orden.show();
			System.out.println("CABO");
		}else {
			System.out.println("********************************");
			System.out.println("La orden no se pudo realizar.");
		}
		
	}

}
