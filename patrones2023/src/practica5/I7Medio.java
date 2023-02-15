package practica5;

public class I7Medio extends PcBuilder {

	@Override
	public void procesador() {
		this.compu.setProcesador("i7");
		
	}

	@Override
	public void ram() {
		this.compu.setRam(16);
		
	}

	@Override
	public void video() {
		this.compu.setVideo(8);
	}

	@Override
	public void monitor() {
		this.compu.setMonitor(32);
	}

	@Override
	public void teclado() {
		this.compu.setTeclado("Luminoso");
		
	}

	@Override
	public void mouse() {
		this.compu.setMouse("Luminoso");
	}

}
