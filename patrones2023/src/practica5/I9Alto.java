package practica5;

public class I9Alto extends PcBuilder {

	@Override
	public void procesador() {
		this.compu.setProcesador("i9");
		
	}

	@Override
	public void ram() {
		this.compu.setRam(32);
		
	}

	@Override
	public void video() {
		this.compu.setVideo(16);
	}

	@Override
	public void monitor() {
		this.compu.setMonitor(45);
	}

	@Override
	public void teclado() {
		this.compu.setTeclado("Mecánico");
		
	}

	@Override
	public void mouse() {
		this.compu.setMouse("Gamer");
	}

}
