package practica13adapter;

public class Launcher {

	public static void main(String[] args) {
		IEmpresa1 oscorp = new Oscorp();
		oscorp.iniciarSesion();
		oscorp.generacionDeDatos();
		oscorp.cerrarSesion();
		
		IEmpresa2 stark = new StarkIndustries();
		stark.login();
		stark.reportes();
		stark.logout();
		
		Oscorp os = new Oscorp();
		IEmpresa2 starkII = new Adapter(os);
		
		starkII.login();
		starkII.reportes();
		starkII.logout();

	}

}
