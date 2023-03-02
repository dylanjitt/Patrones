package practica9;

public class Nivel3 implements Iaccion {
	
	private Peleador peleador;
	
	

	public Nivel3(Peleador peleador) {
		this.peleador = peleador;
	}

	@Override
	public void execute() {
		System.out.println("NIVEL 3");
		System.out.println("> Accion habilitada: ATACAR");
		peleador.saltar();
		peleador.correr();
		peleador.golpear();
		System.out.println("------------------------------");
		
	}

}
