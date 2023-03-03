package practica10;

public class Cliente implements Iuser {
	
	private String name;
	private String ci;
	private int cel;
	
	public Cliente(String name, String ci, int cel) {
		this.name = name;
		this.ci = ci;
		this.cel = cel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public int getCel() {
		return cel;
	}

	public void setCel(int cel) {
		this.cel = cel;
	}
	
	public void infoUser() {
		System.out.println("Bienvenido: "+name+" ("+ci+") -> "+cel);
	}

	@Override
	public void update(Notificacion notifi) {
		notifi.showNotificacion();
		
	}
	
	

}
