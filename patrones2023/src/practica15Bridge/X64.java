package practica15Bridge;

public class X64 implements IArchitecture{

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "x64";
	}

	@Override
	public void infoArch() {
		System.out.println("Arquitectura: X64 -> 64 Bits\n");
		
	}

}
