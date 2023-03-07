package mediator4;

public abstract class Persona {
	protected IcanalComunicacion canalcomm;
	private String nombre;
	private String chatMode;
	
	public Persona(IcanalComunicacion canalcomm) {
		this.canalcomm = canalcomm;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getChatMode() {
		return chatMode;
	}

	public void setChatMode(String chatMode) {
		this.chatMode = chatMode;
	}
	
	public abstract void send(String msg);
	public abstract void recieved(String msg);
	

}
