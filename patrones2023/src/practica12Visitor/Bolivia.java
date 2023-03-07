package practica12Visitor;

public class Bolivia implements Ipais{
	private Double bs;



	public Bolivia(Double bs) {
		this.bs = bs;
	}


	public Double getBs() {
		return bs;
	}


	public void setBs(Double bs) {
		this.bs = bs;
	}


	@Override
	public void trade(Iperson person) {
		person.exchange(this);
		
	}
	
	

}
