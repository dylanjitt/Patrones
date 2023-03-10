package practica2;

public class Accesorios {
	
	private boolean audifono;
	private boolean cargador;
	private boolean estuche;
	
	public Accesorios(boolean audifono, boolean cargador, boolean estuche) {
		this.audifono = audifono;
		this.cargador = cargador;
		this.estuche = estuche;
	}

	public boolean isAudifono() {
		return audifono;
	}

	public void setAudifono(boolean audifono) {
		this.audifono = audifono;
	}

	public boolean isCargador() {
		return cargador;
	}

	public void setCargador(boolean cargador) {
		this.cargador = cargador;
	}

	public boolean isEstuche() {
		return estuche;
	}

	public void setEstuche(boolean estuche) {
		this.estuche = estuche;
	}
	
	public void accesoriesInfo() {
		System.out.print("AUDIFONO: ");
		if (audifono) {
			System.out.println("SI");
		}else {
			System.out.println("NO");
		}
		
		System.out.print("CARGADOR: ");
		if (cargador) {
			System.out.println("SI");
		}else {
			System.out.println("NO");
		}
		
		System.out.print("ESTUCHE: ");
		if (estuche) {
			System.out.println("SI");
		}else {
			System.out.println("NO");
		}
	}
	

}
