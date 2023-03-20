package practica17Decorator;

public class Turbo extends Accesorio{


	
	public Turbo(Auto auto) {
		
		super(auto,"Turbo");
		
	}
	
	@Override
	public void avanzar() {
		super.avanzar();
		System.out.println("Anadiendo tanques de turbo para mas velocidad");
		
	}

}
