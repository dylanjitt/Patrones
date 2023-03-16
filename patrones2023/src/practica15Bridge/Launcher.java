package practica15Bridge;

public class Launcher {

	public static void main(String[] args) {
		X86 x86 = new X86();
		X64 x64 = new X64();
		
		Windows windows = new Windows(x86);
		windows.infoOs();
		
		windows.setArq(x64);
		windows.infoOs();
		
		Linux linux = new Linux(x86);
		linux.infoOs();
		
		linux.setArq(x64);
		linux.infoOs();
		
		MacOS mac = new MacOS(x86);
		mac.infoOs();
		
		mac.setArq(x64);
		mac.infoOs();

	}

}
