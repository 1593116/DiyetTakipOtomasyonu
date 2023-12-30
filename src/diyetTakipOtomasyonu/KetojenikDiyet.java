package diyetTakipOtomasyonu;

public class KetojenikDiyet extends Besin {
	 private static String ad="Ketojenik Diyet";
	 public KetojenikDiyet() {
	        super(ad);
	        } 
		@Override
		public void diyetBilgisi() {

			System.out.println(ad+":Karbonhidrat ve protein kaynaklarının oldukça kısıtlı olduğu ve diyet içeriğinin çok büyük bir kısmının yağlardan oluştuğu diyetler olarak tanımlanabilir.");
		}
		@Override
		public String getAd() {
			
			return ad;
		}
		@Override
		public void ornekMenuEkle() {
			System.out.println("***** Örnek Ketojenik Diyet Menüsü *****");
			
			System.out.println("#Sabah Kahvaltısı: ");
			System.out.println("Tereyağında organik 1 yumurta(erkeklerde 2 adet),avokado,15 zeytin,3-4 ceviz,normal beyaz peynir,bol yeşillik. ");
			
			System.out.println("#Ara Öğün:");
			System.out.println("10 adet tuzsuz yer fıstığı.");
			
			System.out.println("#Öğlen Yemeği:");
			System.out.println("Lüfer,sardalya,hamsi veya istavrit balık çeşitlerinden herhangi biri(fırında pişirilecek),bol salata,1 kase yağlı yoğurt.");
			
			System.out.println("#Akşam Yemeği:");
			System.out.println("1 porsiyon sebze yemeği,bol yeşil salata,1 kase yağlı yoğurt.");
		
			
			System.out.println("#Ara Öğün:");
			System.out.println("1 adet meyve.");
			
	}
		

}
