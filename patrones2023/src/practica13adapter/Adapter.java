package practica13adapter;

public class Adapter implements IEmpresa2{

	private Oscorp emp1;
	
	
	
	public Adapter(Oscorp emp1) {
		this.emp1 = emp1;
	}

	@Override
	public void login() {
		System.out.println(">    System adapted from "+emp1.getName());
		emp1.setName("Stark Industries");
		emp1.iniciarSesion();
		
	}

	@Override
	public void logout() {
		emp1.cerrarSesion();
	}

	@Override
	public void reportes() {
		System.out.println("> Data recovered from DataBases<<<");
		emp1.generacionDeDatos();
		System.out.println("<");
		
	}

}
