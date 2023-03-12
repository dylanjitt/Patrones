package practica13adapter;

public class Oscorp implements IEmpresa1{
	private String name = "Oscorp";

	public Oscorp() {}
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void iniciarSesion() {
		System.out.println("Bienvenido a "+name);
		System.out.println("INICIO DE SESION: ");
		System.out.println("USER: Admin");
		System.out.println("Password: *************");
		
	}

	@Override
	public void cerrarSesion() {
		System.out.println("Cerrando sesion...");
		System.out.println("--------------------------------------------");
		
	}

	@Override
	public void generacionDeDatos() {
		System.out.println("Generando datos necesarios para el sistema: ");
		System.out.println("> app iOS");
		System.out.println("> app Andorid");
		System.out.println("> app WindowsPhone");
		
	}

}
