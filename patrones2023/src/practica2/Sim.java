package practica2;

public class Sim {
	private String nombreEmpresaTel;
	private int numeroTelefono;
	
	public Sim(String nombreEmpresaTel, int numeroTelefono) {
		this.nombreEmpresaTel = nombreEmpresaTel;
		this.numeroTelefono = numeroTelefono;
	}

	public String getNombreEmpresaTel() {
		return nombreEmpresaTel;
	}

	public void setNombreEmpresaTel(String nombreEmpresaTel) {
		this.nombreEmpresaTel = nombreEmpresaTel;
	}

	public int getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	
	public void showInfo() {
		System.out.println("SIM-INFO -- PROVIDER: "+nombreEmpresaTel+" -- NUMBER: "+numeroTelefono);
	}
	
	

}
