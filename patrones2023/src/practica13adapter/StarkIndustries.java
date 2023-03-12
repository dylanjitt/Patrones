package practica13adapter;

public class StarkIndustries implements IEmpresa2{

	private String name = "Stark Industries";
	
	public StarkIndustries() {}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void login() {
		System.out.println("> LOGIN >>>> ");
		System.out.println("USER: Admin");
		System.out.println("Password: *************");
		System.out.println("Welcome again to "+name);
		
	}

	@Override
	public void logout() {
		System.out.println("Loggin Out...");
		System.out.println(name+" System Logged out");
		System.out.println("---------------------------");
		
	}

	@Override
	public void reportes() {
		System.out.println("Reporting Data:");
		System.out.println("- iOS");
		System.out.println("- Andorid");
		System.out.println("- WindowsPhone");
		
	}

}
