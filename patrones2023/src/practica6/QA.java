package practica6;

public class QA extends Persona{
	
	private String grado;
	
	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public QA(ICanalCommunication canalComunication) {
        super(canalComunication);
        super.setCargo("QA");
    }
	
	public void info() {
		System.out.println("-----------------");
		System.out.println("QUALITY ASSURANCE");
		showInfo();
		System.out.println("GRADO: "+grado);
	}
	
	@Override
    public void send(String msg) {
        this.canalcomm.send(msg,this);
    }

    @Override
    public void received(String msg) {
        this.info();
        System.out.println("INFO > received > "+msg+"\n");
    }

}
