package practica17Decorator;

public class Taxi implements Auto {
	
	private int velocidades;
	
	public Taxi(int velocidades) {
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
		System.out.println("Taxi: "+velocidades+" Velocidades");
		System.out.println("El Taxi está avanzando...");
		
	}

}
