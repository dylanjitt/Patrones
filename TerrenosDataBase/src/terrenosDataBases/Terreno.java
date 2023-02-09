package terrenosDataBases;

public class Terreno {

	private String vegetacion;
	private int base;
	private int altura;
	private String preconsolidacion;
	private Persona dueno;
	private String locaterri;

	public Terreno(Persona dueno, int base, int altura, String preconsolidacion, String vegetacion, String locaterri) {
		this.vegetacion = vegetacion;
		this.base = base;
		this.altura = altura;
		this.preconsolidacion = preconsolidacion;
		this.dueno = dueno;
		this.locaterri = locaterri;
	}

	public String getLocaterri() {
		return locaterri;
	}

	public void setLocaterri(String locaterri) {
		this.locaterri = locaterri;
	}

	public String getVegetacion() {
		return vegetacion;
	}

	public void setVegetacion(String vegetacion) {
		this.vegetacion = vegetacion;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getaAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getPreconsolidacion() {
		return preconsolidacion;
	}

	public void setPreconsolidacion(String preconsolidacion) {
		this.preconsolidacion = preconsolidacion;
	}

	public Persona getDueno() {
		return dueno;
	}

	public void setDueno(Persona dueno) {
		this.dueno = dueno;
	}

	public String datosdueno() {
		return "El dueño del terreno es: " + dueno.getNombre() + ' ' + dueno.getApellido() + " vive en: "
				+ dueno.getLocalizacion()+", Telefono: "+dueno.getTelefono();

	}

	public String datosterri() {
		return "El area de este terreno es: " + base * altura +" ("+ base+","+altura+")"+ ", Su ubicacion es: " + locaterri
				+ ", El tipo de suelo es: " + preconsolidacion + ", Su vegetacion es: " + vegetacion + '.';
	}

	public void datosduenoind() {
		System.out.println("===========================================================");
		System.out.println("El dueño de este terreno es: " + dueno.getNombre() + ' ' + dueno.getApellido()
				+ " Y vive en: " + dueno.getLocalizacion());
		System.out.println("===========================================================");

	}

	public void datosterriind() {
		System.out.println("===========================================================");
		System.out.println("El area de este terreno es: " + base * altura + ", Su ubicacion es: " + locaterri
				+ ", El tipo de suelo es: " + preconsolidacion + ", Su vegetacion es: " + vegetacion + '.');
		System.out.println("Y su dueño es: "+dueno.getNombre()+' '+dueno.getApellido());
		System.out.println("===========================================================");
	}



}
