package practica5;

public abstract class PcBuilder {
	protected Computadora compu;

	public Computadora getCompu() {
		return compu;
	}
	
	public void setCompu() {
		compu = new Computadora();
	}
	
	public abstract void procesador();
	public abstract void ram();
	public abstract void video();
	public abstract void monitor();
	public abstract void teclado();
	public abstract void mouse();

}
