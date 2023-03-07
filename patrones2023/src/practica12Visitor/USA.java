package practica12Visitor;

public class USA implements Ipais{
	private Double sus;



	public USA(Double sus) {
		this.sus = sus;
	}


	public Double getBs() {
		return sus;
	}


	public void setSus(Double sus) {
		this.sus = sus;
	}


	@Override
	public void trade(Iperson person) {
		person.exchange(this);
		
	}

}
