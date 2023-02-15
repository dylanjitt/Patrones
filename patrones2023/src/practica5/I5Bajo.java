package practica5;

public class I5Bajo extends PcBuilder {

	@Override
	public void procesador() {
		this.compu.setProcesador("i5");
		
	}

	@Override
	public void ram() {
		this.compu.setRam(8);
		
	}

	@Override
	public void video() {
		this.compu.setVideo(4);
	}

	@Override
	public void monitor() {
		this.compu.setMonitor(24);
	}

	@Override
	public void teclado() {
		this.compu.setTeclado("Membrana");
		
	}

	@Override
	public void mouse() {
		this.compu.setMouse("Normal");
	}

}
