package proizvodi;

import java.util.ArrayList;
import java.util.List;

import interfejs.SpecifikacijaInterfejs;

public class Magacin implements SpecifikacijaInterfejs {


	List<Artikal> artikli = new ArrayList<>();

	
	@Override
	public void dodajArtikal(Artikal a) {

		if(a==null || artikli.contains(a) ) {
			throw new IllegalArgumentException();
		}

		artikli.add(a);
		
	}

	@Override
	public void izbaciArtikal(Artikal a) {

		if(a==null || !artikli.contains(a) ) {
			throw new IllegalArgumentException();
		}

		artikli.remove(a);
		
	}

	@Override
	public List<Artikal> vratiArtikle(int sifra) {
		

		List<Artikal> rezultat = new ArrayList<>();
		
		for(Artikal a: artikli) {
			if(a.getSifra() == sifra) {
				rezultat.add(a);
			}
		}
		
		return rezultat;



	}

}
