package prestamo7;

public class Prestamo {
	
	private int percentage;

	public Prestamo(int percentage) {
		this.percentage = percentage;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
	public void info() {
		
		System.out.println("Porcentaje de la deuda pagado: "+percentage+"%");
	}

	

}
