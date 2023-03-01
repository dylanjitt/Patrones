package practica8;

public class Falla {
	
	private String titulo;
	private String severidad;
	private String descripcion;
	public Falla(String titulo, String severidad) {
		this.titulo = titulo;
		this.severidad = severidad;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSeveridad() {
		return severidad;
	}
	public void setSeveridad(String severidad) {
		this.severidad = severidad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void infoFalla() {
		System.out.println("------------------------");
		System.out.println("FALLA: "+titulo);
		System.out.println("SEVERIDAD: "+severidad);
		System.out.println("Descripcion: "+descripcion);
	}

}
