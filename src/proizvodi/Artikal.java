package proizvodi;

public class Artikal {

	String naziv;
	int sifra;
	String opis;
	int kolicina;
	
	public Artikal() {
		// TODO Auto-generated constructor stub
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if(naziv == null) {
			throw new NullPointerException();
		}
		this.naziv = naziv;
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		if(sifra == 0) {
			throw new NullPointerException();
		}
		this.sifra = sifra;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		if(opis == null) {
			throw new NullPointerException();
		}
		this.opis = opis;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		if(kolicina == 0) {
			throw new NullPointerException();
		}
		this.kolicina = kolicina;
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
		return "naziv: " + naziv + " kolicina: " + kolicina + " opis: "  + opis;
	}
	
	
	
}
