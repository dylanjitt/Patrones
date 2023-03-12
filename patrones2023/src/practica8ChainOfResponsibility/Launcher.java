package practica8ChainOfResponsibility;

public class Launcher {

	public static void main(String[] args) {
		Soporte soporte = new Soporte();
		Falla falla = new Falla("UI BUGEADO","CRITICA");
		falla.setDescripcion("XD");
		
		soporte.fallaReport(falla);

	}

}
