package practica17Decorator;

public class Vagoneta implements Auto {
	
	private int velocidades;
	
	public Vagoneta(int velocidades) {
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
		System.out.println("Vagoneta: "+velocidades+" Velocidades");
		System.out.println("La Vagoneta está avanzando...");
		
	}

}
