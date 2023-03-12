package practica11State;

public class Off implements IstatusComputer {

	@Override
	public void computerState(Computadora computadora) {
		System.out.println("------------------------------------------");
		System.out.println("ORDENADOR APAGADO.");
		computadora.setCpuConsume(0);
		computadora.setRamConsume(0);
		computadora.info();
		
	}
	

}
