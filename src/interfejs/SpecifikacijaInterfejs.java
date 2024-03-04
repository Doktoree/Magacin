package interfejs;

import java.util.List;

import proizvodi.Artikal;

public interface SpecifikacijaInterfejs {

	public void dodajArtikal(Artikal a);
	public void izbaciArtikal(Artikal a);
	public List<Artikal> vratiArtikle(int sifra);
	
}
