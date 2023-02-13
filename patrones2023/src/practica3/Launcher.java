package practica3;

public class Launcher {

	public static void main(String[] args) {
		PasajeRegular r1 = new Regular1creator().create();
		PasajeRegular r2 = new Regular2creator().create();
		
		PasajeSolidario s1 = new Solidario1creator().create();
		PasajeSolidario s2 = new Solidario2creator().create();
		
		PasajeInfantes i1 = new Infante1creator().create();
		PasajeInfantes i2 = new Infante2creator().create();
		
		r1.infoPasaje();
		r2.infoPasaje();
		s1.infoPasaje();
		s2.infoPasaje();
		i1.infoPasaje();
		i2.infoPasaje();

	}

}
