package mediator4;

public class Grupal extends Persona {

	public Grupal(IcanalComunicacion canalcomm) {
		super(canalcomm);
		super.setChatMode("grupal");
	}

	@Override
	public void send(String msg) {
		System.out.println("-----------------------------------");
		System.out.println(super.getNombre()+" sent a message:");
		System.out.println("	>"+msg);
		this.canalcomm.send(msg, this);
		
	}

	@Override
	public void recieved(String msg) {
		System.out.println("- Recieved by: "+super.getNombre());
		
		
	}

}
