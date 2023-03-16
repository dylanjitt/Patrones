package practica15Bridge;

public class Linux implements IOS{
	
	private String name= "Linux";
	
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

	public Linux(IArchitecture arq) {
		this.arq = arq;
	}



	@Override
	public void infoOs() {
		System.out.println("Info OS: "+name+" "+arq.type());
		arq.infoArch();
		
	}

}
