package practica2;

public class Launcher {

	public static void main(String[] args) {
		Phone model = new Phone(new Sim("VIVA", 69696969));
		model.setSize(163);
		model.setCpuCoreAmount(8);
		model.setRamMemory(8);
		model.setAndoridVersion(13);
		model.setCameraMPX(40);
		model.setBluetoothVersion(5);
		model.setExtMemoMaxSupport(512);
		model.setBatteryLife(8);
		model.setAccesorios(new Accesorios(false, true, false));
		model.showInfo();
		
		Phone model2= model.clone();
		model2.setSim(new Sim("TIGO",42042042));
		model2.setRamMemory(16);
		model2.setAccesorios(new Accesorios(false, false, true));
		model2.showInfo();
		
		Phone model3= model.clone();
		model3.setSim(new Sim("ENTEL",84556133));
		model3.setAccesorios(new Accesorios(false, true, true));
		model3.showInfo();
		
		Phone model4= model.clone();
		model4.setSim(new Sim("TIGO",12345687));
		model4.setRamMemory(16);
		model4.setBatteryLife(7);
		model4.setAccesorios(new Accesorios(true, false, false));
		model4.showInfo();
		
		Phone model5= model.clone();
		model5.setSim(new Sim("VIVA",04204204));
		model5.setAndoridVersion(14);
		model5.setAccesorios(new Accesorios(true, true, true));
		model5.showInfo();
		
		

	}

}
