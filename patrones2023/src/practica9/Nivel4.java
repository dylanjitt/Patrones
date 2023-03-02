package practica9;

public class Nivel4 implements Iaccion {
	
	private Peleador peleador;
	
	

	public Nivel4(Peleador peleador) {
		this.peleador = peleador;
	}

	@Override
	public void execute() {
		System.out.println("NIVEL 4");
		System.out.println("> Accion habilitada: CONTRA-ATAQUE");
		peleador.correr();
		peleador.saltar();
		peleador.correr();
		peleador.saltar();
		peleador.protegerse();
		peleador.golpear();
		peleador.curarse();
		peleador.correr();
		System.out.println("------------------------------");
		
	}

}
