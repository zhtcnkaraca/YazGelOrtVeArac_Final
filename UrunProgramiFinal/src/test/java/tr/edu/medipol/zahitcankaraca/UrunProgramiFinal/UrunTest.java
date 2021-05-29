package tr.edu.medipol.zahitcankaraca.UrunProgramiFinal;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UrunTest {
	public static List<Urun> urunler=new ArrayList<>();
	@Test
	public void listele() {
		urunler = UrunDepo.urunleriGetir();
		Assert.assertEquals("Iphone XS Max", urunler.get(0).getAd());
	} 
			
	
	@Test
	public void ekle() {
		urunler =UrunDepo.urunleriEkle(new Urun("Test1","TestFiyat"));
		Assert.assertEquals("Test1",urunler.get(3).getAd());
	}
	
	
	@Test
	 public void sil() {
		urunler = UrunDepo.urunSil("Test");
		Assert.assertEquals(3, urunler.size());
	}

}
