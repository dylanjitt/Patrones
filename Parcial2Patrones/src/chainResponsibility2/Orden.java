package chainResponsibility2;

public class Orden {
	
	public Orden(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println("-----------------------");
		System.out.println("ORDEN: "+name);
		System.out.print("Asignada a: ");
	}

}
