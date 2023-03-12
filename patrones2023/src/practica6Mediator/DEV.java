package practica6Mediator;

public class DEV extends Persona{
	
	private String lenguaje;
	
	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	public DEV(ICanalCommunication canalComunication) {
        super(canalComunication);
        super.setCargo("DEV");
    }
	
	public void info() {
		System.out.println("-----------------");
		System.out.println("DEVELOPER");
		showInfo();
		System.out.println("LENGUAJE: "+lenguaje);
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
