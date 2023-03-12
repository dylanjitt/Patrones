package practica6Mediator;

public class SM extends Persona{
	
	private String certificaciones;
	
	public String getCertificaciones() {
		return certificaciones;
	}

	public void setCertificaciones(String certificaciones) {
		this.certificaciones = certificaciones;
	}

	public SM(ICanalCommunication canalComunication) {
        super(canalComunication);
        super.setCargo("SM");
    }
	
	public void info() {
		System.out.println("-----------------");
		System.out.println("SCRUM MASTER");
		showInfo();
		System.out.println("CERTIFICACIONES: "+certificaciones);
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
