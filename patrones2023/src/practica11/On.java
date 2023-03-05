package practica11;

public class On implements IstatusComputer{

	@Override
	public void computerState(Computadora computadora) {
		computadora.executeProgram("Steam");
		computadora.executeProgram("Epic Games Store");
		computadora.executeProgram("Discord");
		computadora.executeProgram("Adobe Crative Cloud");
		computadora.executeProgram("Logitech");
		computadora.executeProgram("OneDrive");
		
		System.out.println("------------------------------------------");
		System.out.println("ORDENADOR ENCENDIDO");
		System.out.println(" ");
		computadora.info();
		
	}

}
