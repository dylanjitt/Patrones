package practica17Decorator;

public class GPS extends Accesorio{


	
	public GPS(Auto auto) {
		
		super(auto,"GPS");
		
	}
	
	@Override
	public void avanzar() {
		super.avanzar();
		System.out.println("Calculando ubicacion precisa del vehiculo");
		
	}

}
