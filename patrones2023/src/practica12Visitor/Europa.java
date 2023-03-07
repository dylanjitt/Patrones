package practica12Visitor;

public class Europa implements Ipais{
	private Double euro;



	public Europa(Double euro) {
		this.euro = euro;
	}


	public Double getEuro() {
		return euro;
	}


	public void setBs(Double euro) {
		this.euro = euro;
	}


	@Override
	public void trade(Iperson person) {
		person.exchange(this);
		
	}

}
