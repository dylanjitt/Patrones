package practica5;

public class Assembling {
	private PcBuilder builder;
	
	public Computadora getComputadora() {
		return builder.getCompu();
	}
	
	public void setTipoPC(PcBuilder builder) {
		this.builder = builder;
	}
	
	public void buildPC() {
		this.builder.setCompu();
		this.builder.procesador();
		this.builder.ram();
		this.builder.video();
		this.builder.monitor();
		this.builder.teclado();
		this.builder.mouse();
	}

}
