package practica9Command;

public class Nivel1 implements Iaccion {
	
	private Peleador peleador;
	
	

	public Nivel1(Peleador peleador) {
		this.peleador = peleador;
	}

	@Override
	public void execute() {
		System.out.println("NIVEL 1");
		System.out.println("> Accion habilitada: CORRER");
		peleador.correr();
		System.out.println("------------------------------");
		
	}

}
