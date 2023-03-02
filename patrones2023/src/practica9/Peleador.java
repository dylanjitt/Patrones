package practica9;

public class Peleador {
	
	private String name;

	public Peleador(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void saltar() {
		System.out.println(name+" ha dado un salto!");
	}
	
	public void correr() {
		System.out.println(name+" esta corriendo");
	}
	
	public void protegerse() {
		System.out.println(name+" ha encontrado un lugar para protegerse del daño");
	}
	
	public void curarse() {
		System.out.println(name+" se esta curando");
	}
	
	public void golpear() {
		System.out.println(name+" ha dado un golpe al enemigo");
	}
	
	public void info() {
		System.out.println("JUGADOR: "+name);
	}
	

}
