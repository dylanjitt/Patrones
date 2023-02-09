package SegundoParcial;

public class P4ej1 {
	
	public static void main(String[] args) {
		Persona2 pedro = new Persona2("Pedro Manuel Jose Antonio", "Magallanes Doblas Santander");
		Estud jm = new Estud("Jose Maria Andres", "Pinto Pinelli Pinto Saravia");
		Verifier ve = new Verifier();
		ve.contador(pedro);
		ve.contador(jm);
	}
}