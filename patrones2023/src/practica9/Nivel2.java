package practica9;

public class Nivel2 implements Iaccion {
	
	private Peleador peleador;
	
	

	public Nivel2(Peleador peleador) {
		this.peleador = peleador;
	}

	@Override
	public void execute() {
		System.out.println("NIVEL 2");
		System.out.println("> Accion habilitada: REGENERACION");
		peleador.protegerse();
		peleador.curarse();
		System.out.println("------------------------------");
		
	}

}
