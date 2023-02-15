package practica5;

public class Launcher {

	public static void main(String[] args) {
		Assembling assembling = new Assembling();
		I9Alto i9 = new I9Alto();
		I7Medio i7 = new I7Medio();
		I5Bajo i5 = new I5Bajo();
		
		assembling.setTipoPC(i9);
		assembling.buildPC();
		
		Computadora compu = assembling.getComputadora();
		compu.showInfo();
		
		assembling.setTipoPC(i7);
		assembling.buildPC();
		
		Computadora compu2 = assembling.getComputadora();
		compu2.showInfo();
		
		assembling.setTipoPC(i5);
		assembling.buildPC();
		
		Computadora compu3 = assembling.getComputadora();
		compu3.showInfo();

	}

}
