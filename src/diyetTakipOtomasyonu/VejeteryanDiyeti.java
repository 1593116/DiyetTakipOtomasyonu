package diyetTakipOtomasyonu;

public class VejeteryanDiyeti extends Besin {

	
	private static String ad="Vejetaryan Diyeti";
	 public VejeteryanDiyeti() {
	        super(ad);
	 }
	@Override
	public void diyetBilgisi() {

		System.out.println(ad+":Bitkisel kaynaklı olan bir diyet çeşididir ve aynı zamanda hayvansal kaynaklı besinlerin bazıları da tüketilmektedir");
	}
	@Override
	public String getAd() {
		
		return ad;
	}
	@Override
	public void ornekMenuEkle() {
		System.out.println("***** Örnek Vejeteryan Diyeti Menüsü *****");
		
		System.out.println("#Sabah Kahvaltısı: ");
		System.out.println("1 Su bardağı süt veya yoğurt, 2 yemek kaşığı yulaf ezmesi,1/2 yeşil elma,2 tam ceviz.");
		
		System.out.println("#Ara Öğün:");
		System.out.println("1 Havuç,1 Fincan beyaz çay.");
		
		System.out.println("#Öğlen Yemeği:");
		System.out.println("4 Yemek kaşığı haşlanmış zerdeçallı nohut,1 tatlı kaşığı zeytinyağlı bol yeşillikli salata,1 çay kaşığı zerdeçal ve biberli 1 kase yoğurt.");
		
		System.out.println("#Ara Öğün:");
		System.out.println("1 Küçük su bardağı tarçınlı kefir.");
		
		System.out.println("#Akşam Yemeği:");
		System.out.println("2 Yumurtalı bol dereotlu veya brokolili omlet , 1 ince dilim esmer ekmek.");
		
		System.out.println("#Ara Öğün:");
		System.out.println("1 Kivi, Aromalı detoks suyu.");
		
		
	}
}
