package memento1;

public class Tesis {
	
	private String titulo;
	private String autor;
	private String contenido;
	
	public Tesis(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	public void tesisInfo() {
		System.out.println("--------------------");
		System.out.println("Titulo: "+titulo);
		System.out.println("Autor: "+autor);
		System.out.println("> "+contenido);
	}
	
	

}
