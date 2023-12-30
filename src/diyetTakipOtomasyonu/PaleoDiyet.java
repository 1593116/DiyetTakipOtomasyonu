package diyetTakipOtomasyonu;

public class PaleoDiyet extends Besin {
	
	 private static String ad="Paleo Diyet";
	 public PaleoDiyet() {
	        super(ad);
	        } 
		@Override
		public void diyetBilgisi() {

			System.out.println(ad+":Yüzyıllar öncesi ilkel hayatta yaşamış insanların beslenme tarzını baz alan bir diyet yaklaşımıdır.");
		}
		@Override
		public String getAd() {
			
			return ad;
		}
		@Override
      public void ornekMenuEkle() {
		System.out.println("***** Örnek Paleo Diyet Menüsü *****");
		
		System.out.println("#Sabah Kahvaltısı: ");
		System.out.println("2 Yumurta,Domates,salatalık,maydanoz,2 adet ceviz içi.");
		
		System.out.println("#Ara Öğün:");
		System.out.println("10 Tane fındık, 2 tane kuru kayısı.");
		
		System.out.println("#Öğlen Yemeği:");
		System.out.println("150 gr haşlama veya ızgara et, tavuk veya balık,haşlama sebze ,zeytinyağlı-limonlu mevsim salatası.");
		
		System.out.println("#Ara Öğün:");
		System.out.println("1 Elma ,2 tane ceviz içi.");
	
		
		System.out.println("#Akşam Yemeği:");
		System.out.println("Zeytinyağlı sebze yemeği,bol yeşillikli salata.");
		
		System.out.println("#Ara Öğün:");
		System.out.println("1 tane şeftali.");
		
}
}
