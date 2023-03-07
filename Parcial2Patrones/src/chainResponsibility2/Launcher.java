package chainResponsibility2;

public class Launcher {
	public static void main(String[] args) {
		Management m = new Management();
		m.orderReport(new Orden("Entrevistas"));
		m.orderReport(new Orden("Disciplina"));
		m.orderReport(new Orden("Desbloqueos"));
		m.orderReport(new Orden("Manifestaciones"));
		m.orderReport(new Orden("Limpiezas"));
		m.orderReport(new Orden("Limpieza"));

		
	}

}
