package practica6;

public abstract class Persona {
	protected ICanalCommunication canalcomm;
	private String name;
	private String ci;
	private String cargo; 
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Persona(ICanalCommunication canalComunication){
        this.canalcomm=canalComunication;
    }
	
	public String getName() {
        return name;
    }

    public Persona setName(String name) {
        this.name = name;
        return this;
    }
    
    public String getCi() {
        return ci;
    }

    public Persona setCi(String ci) {
        this.ci = ci;
        return this;
    }
    
    public void showInfo(){
        System.out.println("NAME: "+name);
        System.out.println("CI: "+ci);
    }
    
    public abstract void send(String msg);
    public abstract void received(String msg);

}
