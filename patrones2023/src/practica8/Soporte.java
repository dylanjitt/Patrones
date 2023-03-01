package practica8;

public class Soporte implements Ihandler {

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
	public void fallaReport(Falla falla) {
		
		PO po = new PO();
		QA qa = new QA();
		DEV dev = new DEV();
		
		this.setNext(po);
		po.setNext(qa);
		qa.setNext(dev);
		
		if (falla.getSeveridad().equals("BAJA")) {
			falla.infoFalla();
			System.out.println("revision asignada para SOPORTE");
		}else {
			this.next.fallaReport(falla);
		}
		
	}

}
