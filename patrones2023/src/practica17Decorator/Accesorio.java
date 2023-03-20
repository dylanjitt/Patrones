package practica17Decorator;

public class Accesorio implements Auto{
	
	private Auto auto;
	private String name;
	
	

	public Accesorio(Auto auto, String name) {
		this.auto = auto;
		this.name = name;
	}
	
	



	public Auto getAuto() {
		return auto;
	}





	public void setAuto(Auto auto) {
		this.auto = auto;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	@Override
	public void avanzar() {
		auto.avanzar();
		System.out.println("Se ha añadido un accesorio: "+name);
		
	}

}
