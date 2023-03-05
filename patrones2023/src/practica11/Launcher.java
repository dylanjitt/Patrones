package practica11;

public class Launcher {

	public static void main(String[] args) {

		Computadora pc = new Computadora();
		
		pc.setStatus(new Off());
		pc.useComputer();
		
		pc.setStatus(new On());
		pc.useComputer();
		
		pc.setStatus(new Restart());
		pc.useComputer();

	}

}
