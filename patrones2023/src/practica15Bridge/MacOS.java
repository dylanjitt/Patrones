package practica15Bridge;

public class MacOS implements IOS{
	
	private String name= "Mac OS Yossemite";
	
	private IArchitecture arq;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IArchitecture getArq() {
		return arq;
	}

	public void setArq(IArchitecture arq) {
		this.arq = arq;
	}

	public MacOS(IArchitecture arq) {
		this.arq = arq;
	}



	@Override
	public void infoOs() {
		System.out.println("Operating System: "+name+" "+arq.type());
		arq.infoArch();
		
	}

}
