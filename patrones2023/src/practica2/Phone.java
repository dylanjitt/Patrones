package practica2;

public class Phone implements Iphone{
	
	private int size;
	private int cpuCoreAmount;
	private int ramMemory;
	private Sim sim;
	private int andoridVersion;
	private int cameraMPX;
	private float bluetoothVersion;
	private int extMemoMaxSupport;
	private int batteryLife;
	private Accesorios accesorios;
	
	
	
	public Phone( Sim sim) {
		
		this.sim = sim;
	}



	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	public int getCpuCoreAmount() {
		return cpuCoreAmount;
	}



	public void setCpuCoreAmount(int cpuCoreAmount) {
		this.cpuCoreAmount = cpuCoreAmount;
	}



	public int getRamMemory() {
		return ramMemory;
	}



	public void setRamMemory(int ramMemory) {
		this.ramMemory = ramMemory;
	}



	public Sim getSim() {
		return sim;
	}



	public void setSim(Sim sim) {
		this.sim = sim;
	}



	public int getAndoridVersion() {
		return andoridVersion;
	}



	public void setAndoridVersion(int andoridVersion) {
		this.andoridVersion = andoridVersion;
	}



	public int getCameraMPX() {
		return cameraMPX;
	}



	public void setCameraMPX(int cameraMPX) {
		this.cameraMPX = cameraMPX;
	}



	public float getBluetoothVersion() {
		return bluetoothVersion;
	}



	public void setBluetoothVersion(float bluetoothVersion) {
		this.bluetoothVersion = bluetoothVersion;
	}



	public int getExtMemoMaxSupport() {
		return extMemoMaxSupport;
	}



	public void setExtMemoMaxSupport(int extMemoMaxSupport) {
		this.extMemoMaxSupport = extMemoMaxSupport;
	}



	public int getBatteryLife() {
		return batteryLife;
	}



	public void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}



	public Accesorios getAccesorios() {
		return accesorios;
	}



	public void setAccesorios(Accesorios accesorios) {
		this.accesorios = accesorios;
	}



	@Override
	public Phone clone() {
		Phone clone = new Phone( this.sim);
		clone.setSize(this.size);
		clone.setCpuCoreAmount(this.cpuCoreAmount);
		clone.setAndoridVersion(this.andoridVersion);
		clone.setCameraMPX(this.cameraMPX);
		clone.setBluetoothVersion(this.bluetoothVersion);
		clone.setBatteryLife(this.batteryLife);
		clone.setAccesorios(this.accesorios);
		
		return clone;
		
	}
	
	public void showInfo() {
		System.out.println("------------------------------");
		System.out.println("------SAMSUNG GALAXY R10------");
		System.out.println("Tama??o: "+size+" cm.");
		System.out.println("CPU Cores: "+cpuCoreAmount);
		System.out.println("Memoria RAM: "+ramMemory+" Gb");
		sim.showInfo();
		System.out.println("Camara: "+cameraMPX+" Mpx.");
		System.out.println("Bluettoth version: "+bluetoothVersion);
		System.out.println("Soporte Almacenamiento Externo: "+extMemoMaxSupport+ "Gb. (max)");
		System.out.println("Duracion de Bateria: "+batteryLife+" Horas");
		accesorios.accesoriesInfo();
		System.out.println("------------------------------");

	}

}
