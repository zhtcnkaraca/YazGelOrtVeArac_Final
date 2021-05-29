package tr.edu.medipol.zahitcankaraca.UrunProgramiFinal;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/urun")
public class UrunRestApi {
	
	@GetMapping("/listele")
	public static List<Urun> listele(){
		return UrunDepo.urunleriGetir();
	}

	@PostMapping("/ekle")
	public static List<Urun> ekle(String ad,String fiyat){
		return UrunDepo.urunleriEkle(new Urun(ad,fiyat));
	}
	
	@PostMapping("/sil")
	public static List<Urun> sil(String ad){
		return UrunDepo.urunSil(ad);
	}
}
