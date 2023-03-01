package practica8;

public class PO implements Ihandler {
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
	public void fallaReport(Falla falla) {
		if (falla.getSeveridad().equals("MEDIA")) {
			falla.infoFalla();
			System.out.println("revision asignada para PRODUCT OWNER");
		}else {
			next.fallaReport(falla);
		}
		
	}

}
