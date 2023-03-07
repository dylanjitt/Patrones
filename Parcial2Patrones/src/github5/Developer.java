package github5;

public class Developer implements Iuser{
	
	private String name;
	private int comver;
	
	public int getComver() {
		return comver;
	}


	public void setComver(int comver) {
		this.comver = comver;
	}


	public Developer(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void infoUser() {
		System.out.println("Bienvenido: "+name);
	}



	@Override
	public void update(String notificacion) {
		System.out.println(notificacion);
		
	}

}
