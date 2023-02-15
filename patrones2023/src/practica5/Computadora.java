package practica5;

public class Computadora {
	
	private String procesador;
	private int monitor;
	private String teclado;
	private String mouse;
	private int ram;
	private int video;
	
	
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public int getMonitor() {
		return monitor;
	}
	public void setMonitor(int monitor) {
		this.monitor = monitor;
	}
	public String getTeclado() {
		return teclado;
	}
	public void setTeclado(String teclado) {
		this.teclado = teclado;
	}
	public String getMouse() {
		return mouse;
	}
	public void setMouse(String mouse) {
		this.mouse = mouse;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getVideo() {
		return video;
	}
	public void setVideo(int video) {
		this.video = video;
	}
	
	public void showInfo() {
		System.out.println("------------------------");
		System.out.println("PC SELECCIONADA:");
		System.out.println("Procesador: Intel Core "+procesador);
		System.out.println("Memoria RAM: "+ram+" Gb");
		System.out.println("Memoria Tarjeta de Video: "+video+" Gb");
		System.out.println("Monitor: "+monitor+" pulgadas");
		System.out.println("Tipo Teclado: "+teclado);
		System.out.println("Tipo Mouse: "+mouse);
	}

}
