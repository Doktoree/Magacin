package proizvodi;

import java.time.LocalDate;

public class KucnaHemija extends Artikal {

	private LocalDate datum;

	public LocalDate getDatum() {
		return datum;
	}

	public void setDatum(LocalDate datum) {
		if(datum == null) {
			throw new NullPointerException();
		}
		this.datum = datum;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() +  " datum: " + datum;
	}
	
	
}
