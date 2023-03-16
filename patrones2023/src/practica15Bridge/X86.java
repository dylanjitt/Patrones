package practica15Bridge;

public class X86 implements IArchitecture {

	@Override
	public void infoArch() {
		System.out.println("Arquitectura: X86 -> 32 Bits\n");
		
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "x86";
	}

}
