package practica8ChainOfResponsibility;

public class QA implements Ihandler {
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
		if (falla.getSeveridad().equals("ALTA")) {
			falla.infoFalla();
			System.out.println("revision asignada para QUALITY ASSURANCE");
		}else {
			next.fallaReport(falla);
		}
		
	}

}
