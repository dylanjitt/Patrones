package practica17Decorator;

public class Launcher {

	public static void main(String[] args) {
		Auto mini = new Minibus(5);
		mini = new Turbo(mini);
		mini = new GPS(mini);
		mini = new TankGas(mini);
		mini.avanzar();
		
		
		Auto taxi = new Taxi(6);
		taxi = new TankGas(taxi);
		taxi.avanzar();
		
		Auto vago = new Vagoneta(6);
		vago = new Turbo(vago);
		vago = new GPS(vago);
		vago.avanzar();
		
	}

}
