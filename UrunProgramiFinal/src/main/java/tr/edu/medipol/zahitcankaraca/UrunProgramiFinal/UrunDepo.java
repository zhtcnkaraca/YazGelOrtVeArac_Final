package tr.edu.medipol.zahitcankaraca.UrunProgramiFinal;

import java.util.ArrayList;
import java.util.List;


public class UrunDepo {
	private static final List<Urun> URUNLER = new ArrayList<>();
	static {
		URUNLER.add(new Urun("Iphone XS Max","3999TL"));
		URUNLER.add(new Urun("LG OLED TV","5000TL"));
		URUNLER.add(new Urun("Hp Omen Laptop","10000TL"));
	}
	
	private UrunDepo() {
		
	}
	
	public static List<Urun> urunleriGetir() {
		return URUNLER;
	}
	
	public static List<Urun> urunleriEkle(Urun urun){
		URUNLER.add(urun);
		return URUNLER;
	}
	
	public static List<Urun> urunSil(String ad){
		for(Urun o : URUNLER) {
			if(o.getAd().equals(ad)) {
				URUNLER.remove(o);
				return URUNLER;
			}
		}
		return URUNLER;
	}
}
