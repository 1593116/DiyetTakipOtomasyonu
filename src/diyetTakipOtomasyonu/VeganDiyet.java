package diyetTakipOtomasyonu;

public class VeganDiyet extends Besin{

	
	 private static String ad="Vegan Diyeti";
	 public VeganDiyet() {
	 super(ad); 
	 }
	@Override
	public void diyetBilgisi() {

		System.out.println(ad+ ":Hayvansal kaynaklı hiçbir gıda içermeyen tamamen bitki bazlı bir diyettir. ");
	}

	@Override
	public String getAd() {
		
		return ad;
	}
	@Override
	public void ornekMenuEkle() {
		System.out.println("***** Örnek Vegan Diyeti Menüsü *****");
		
		System.out.println("#Sabah Kahvaltısı: ");
		System.out.println("1.Domaates,salatalık,mevsimlik taze yeşillikler ve biber ile zeytin,tam tahıllı bir dilim ekmek ,ada çayı veya yeşil çay.");
		
		System.out.println("#Ara Öğün:");
		System.out.println("Taze ve kuru meyveler,uygun kuruyemişiler ve sıcak içecekler.");
		
		System.out.println("#Öğlen Yemeği:");
		System.out.println("1. Seçilmiş bir bakliyat ile yapılmış az yağlı ve az salçalı bir yemek.");
		System.out.println("2. Bol yeşillikle hazırlanmış ve mevsimlik sebze ve meyvelerle yapılmış salata.");
		
		System.out.println("#Ara Öğün:");
		System.out.println("Taze ve kuru meyveler,uygun kuru yemişler ve sıcak içecekler.");
		
		System.out.println("#Akşam Yemeği:");
		System.out.println("1. Mevsim sebzeleriyle tatlandırılmış ve baharatlarla hazırlanmış pirinç veya bulgur pilavı.");
		System.out.println("2. Ispanak,semiz otu ve lahana gibi sebzelerle bulgur ve pirinci kullanarak hazırlanmış tencere veya fırın yemekleri.");
		
		
	}
	
	
}
