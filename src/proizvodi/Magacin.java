package proizvodi;

import java.util.ArrayList;
import java.util.List;

import interfejs.SpecifikacijaInterfejs;

public class Magacin implements SpecifikacijaInterfejs {

	List<Artikal> artikli = new ArrayList<Artikal>();
	
	@Override
	public void dodajArtikal(Artikal a) {
		artikli.add(a);
		
	}

	@Override
	public void izbaciArtikal(Artikal a) {
		artikli.remove(a);
		
	}

	@Override
	public List<Artikal> vratiArtikle(int sifra) {
		
		return artikli;
	}

}
