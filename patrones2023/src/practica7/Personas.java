package practica7;

public class Personas {
	
	private String name;
	private String ci;
	private int edad;
	
	public Personas(String name, String ci, int edad) {
		this.name = name;
		this.ci = ci;
		this.edad = edad;
	}
	
	public void info() {
		System.out.println(name+" (C.I.: "+ci+"), "+edad+" años");
		//System.out.println("--------------------");
		//System.out.println("NOMBRE: "+name);
		//System.out.println("C.I.: "+ci);
		//System.out.println("EDAD: "+edad);
	}
	

}
