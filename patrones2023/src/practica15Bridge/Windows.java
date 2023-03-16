package practica15Bridge;

public class Windows implements IOS{
	
	private String name= "Windows 7";
	
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

	public Windows(IArchitecture arq) {
		this.arq = arq;
	}



	@Override
	public void infoOs() {
		System.out.println("OS: "+name+" "+arq.type());
		arq.infoArch();
		
	}

}
