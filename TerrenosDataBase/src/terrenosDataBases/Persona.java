package terrenosDataBases;

public class Persona {

	    private String nombre;
	    private String apellido;
	    private int edad;
	    private int telefono;
	    private String localizacion;

	    

	    public int getTelefono() {
			return telefono;
		}

		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}

		public Persona(String nombre, String apellido, int edad, int telefono, String localizacion) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.edad = edad;
			this.telefono = telefono;
			this.localizacion = localizacion;
		}

		public int getEdad() {
	        return edad;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getApellido() {
	        return apellido;
	    }

	    public void setApellido(String apellido) {
	        this.apellido = apellido;
	    }

	    public String getLocalizacion() {
	        return localizacion;
	    }

	    public void setLocalizacion(String localizacion) {
	        this.localizacion = localizacion;
	    }
	    
}
