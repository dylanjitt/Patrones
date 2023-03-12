package practica11State;

public class Restart implements IstatusComputer{

	@Override
	public void computerState(Computadora computadora) {
		System.out.println("------------------------------------------");
		System.out.println("ORDENADOR EN REINICIO.");
		System.out.println("-Consumo actual RAM: "+computadora.getRamConsume()+"%");
		System.out.println("-Consumo actual CPU: "+computadora.getCpuConsume()+"%");
		computadora.shutdown();
		
	}

}
