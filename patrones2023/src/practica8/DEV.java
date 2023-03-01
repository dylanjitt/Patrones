package practica8;

public class DEV implements Ihandler {
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
		if (falla.getSeveridad().equals("CRITICA")) {
			falla.infoFalla();
			System.out.println("revision asignada para DEVELOPER");
		}else {
			System.out.println("La falla no pudo ser procesada");
		}
		
	}

}
