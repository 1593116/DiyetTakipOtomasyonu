package diyetTakipOtomasyonu;

public class GlutensizDiyet extends Besin{
private static String ad="Glutensiz Diyet";
public GlutensizDiyet() {
    super(ad);
    } 
	@Override
	public void diyetBilgisi() {
		
		System.out.println(ad+":Gluten(buğday, arpa ve çavdar gibi tahıllar.) içeren gıdaların beslenme düzeninden tamamen çıkarılması anlamına geliyor.");
		
	}
     @Override
	public String getAd(){
		
		return ad;
	}
     @Override
     public void ornekMenuEkle() {
 		System.out.println("***** Örnek Glutensiz Diyet Menüsü *****");
 		
 		System.out.println("#Sabah Kahvaltısı: ");
 		System.out.println("1 Adet haşlanmış yumurta,1 dilim beyaz peynir,1 dilim mısır ekmeği,domates-salatalık-yeşillik.");
 		
 		System.out.println("#Ara Öğün:");
 		System.out.println("10 adet badem ve 1 kupa bitki çayı.");
 		
 		System.out.println("#Öğlen Yemeği:");
 		System.out.println("3 adet köfte ,4 yemek kaşığı pirinç pilavı(şehriyesiz) ve 1 kase salata.");
 		
 		System.out.println("#Ara Öğün:");
 		System.out.println("1 porsiyon meyve.");
 	
 		
 		System.out.println("#Akşam Yemeği:");
 		System.out.println("1 kase çorba(terbiye,şehriye olmayacak.),6-7 yemek kaşığı ıspanak yemeği,1 kase yoğurt ve 1 dilim mısır ekmeği.");
 		
 		System.out.println("#Ara Öğün:");
 		System.out.println("1 porsiyon meyve ve 1 bardak süt.");
 		
 }
     
     
}
