package practica9Command;

public class Launcher {
	
	public static void main(String[] args) {
		Peleador p = new Peleador("Rodrigo");
		
		Nivel1 n1 = new Nivel1(p);
		Nivel2 n2 = new Nivel2(p);
		Nivel3 n3 = new Nivel3(p);
		Nivel4 n4 = new Nivel4(p);
		
		GeneratorNiveles game = new GeneratorNiveles();
		
		
		System.out.println("BIENVENIDO AL JUEGO DE PELEAS");
		p.info();
		game.addLevel(n1);
		game.addLevel(n2);
		game.addLevel(n3);
		game.addLevel(n4);
		
		game.run();
		
	}

}
