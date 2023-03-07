package comunicacion6;

public class Developer {
	protected IcanalComunication canalcomm;
	private String nombre;
	private boolean groupMode;
	
	public Developer(IcanalComunication canalcomm, String nombre) {
		this.canalcomm = canalcomm;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isGroupMode() {
		return groupMode;
	}

	public void setGroupMode(boolean groupMode) {
		this.groupMode = groupMode;
	}
	
	public void send(String msg) {
		System.out.println("-----------------------------------");
		System.out.println(getNombre()+" sent a message:");
		System.out.println("	>"+msg);
		this.canalcomm.send(msg, this);
		
	};
	
	public void recieved(String msg) {
		System.out.println("- Recieved by: "+getNombre());
	};

}
