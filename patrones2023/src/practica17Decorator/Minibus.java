package practica17Decorator;

public class Minibus implements Auto {
	
	private int velocidades;
	
	public Minibus(int velocidades) {
		this.velocidades = velocidades;
	}

	public int getVelocidades() {
		return velocidades;
	}

	public void setVelocidades(int velocidades) {
		this.velocidades = velocidades;
	}

	@Override
	public void avanzar() {
		System.out.println("Minibus: "+velocidades+" Velocidades");
		System.out.println("El Minibus está avanzando...");
		
	}

}
