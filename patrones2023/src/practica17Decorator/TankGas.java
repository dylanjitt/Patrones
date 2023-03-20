package practica17Decorator;

public class TankGas extends Accesorio{


	
	public TankGas(Auto auto) {
		
		super(auto,"Tanque de Gas");
		
	}
	
	@Override
	public void avanzar() {
		super.avanzar();
		System.out.println("El vehiculo soporta gasolina y Gas Natural");
		
	}

}
