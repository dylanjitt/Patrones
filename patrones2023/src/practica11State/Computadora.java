package practica11State;

import java.util.ArrayList;
import java.util.List;

public class Computadora {
	
	private int ramConsume;
	private int cpuConsume;
	private List<String> programsRunning = new ArrayList<>();
	
	private IstatusComputer status;
	
	public IstatusComputer getStatus() {
		return status;
	}

	public void setStatus(IstatusComputer status) {
		this.status = status;
	}
	
	public void useComputer() {
		status.computerState(this);
	}

	public Computadora() {}

	public int getRamConsume() {
		return ramConsume;
	}

	public void setRamConsume(int ramConsume) {
		this.ramConsume = ramConsume;
	}

	public int getCpuConsume() {
		return cpuConsume;
	}

	public void setCpuConsume(int cpuConsume) {
		this.cpuConsume = cpuConsume;
	}

	public List<String> getProgramsRunning() {
		return programsRunning;
	}

	public void setProgramsRunning(List<String> programsRunning) {
		this.programsRunning = programsRunning;
	}
	
	public void executeProgram(String exe) {
		programsRunning.add(exe);
		ramConsume+=5;
		cpuConsume+=5;
		
	}
	
	public void shutdownProgram(String exe) {
		if (programsRunning.contains(exe)) {
			System.out.println("< "+exe);
			programsRunning.remove(exe);
			ramConsume-=5;
			cpuConsume-=5;
		}
	}
	
	public void shutdown() {
		System.out.println("Cerrando los siguientes programas:");
		for(String exe:programsRunning) {
			System.out.println("< "+exe);
			ramConsume-=5;
			cpuConsume-=5;
		}
		programsRunning.clear();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		info();
	}
	
	public void info() {
		System.out.println("CONSUMO RAM: "+ramConsume+"%");
		System.out.println("CONSUMO CPU: "+cpuConsume+"%");
		if (programsRunning.isEmpty()) {
			System.out.println("No hay programas en ejecucion");
		}else {
			System.out.println("Programas en ejecucion:");
			programsRunning.forEach((s)-> System.out.println("> "+s));
		}
		
	}
	
	

}
