package diyetTakipOtomasyonu;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
				Scanner scanner=new Scanner(System.in);
				Diyet kisi = new Diyet();

		        System.out.print("Lütfen isminizi giriniz: ");
		        String kullaniciad= scanner.nextLine();
		        kisi.setKullaniciad(kullaniciad);
		        
		        String cinsiyet;
		        boolean cinsiyetGecerli = false;

		        do {
		            System.out.print("Cinsiyetinizi giriniz (Cinsiyet kız:'K' veya 'k' erkek:'E' veya 'e'): ");
		            cinsiyet = scanner.nextLine();
		            kisi.setCinsiyet(cinsiyet);

		            if (cinsiyet.equalsIgnoreCase("k") || cinsiyet.equalsIgnoreCase("e")) {
		                cinsiyetGecerli = true;
		            } else {
		                System.out.println("Geçersiz cinsiyet girdiniz. Lütfen tekrar giriniz.");
		            }
		        } while (!cinsiyetGecerli);
		        
		        System.out.print("Lütfen yaşınızı giriniz: ");
		        int yas=scanner.nextInt();
		        kisi.setYas(yas);
		        
		        scanner.nextLine();
		        
		       
		        
		        System.out.print("Kilonuzu kg cinsinden giriniz: ");
		        double kilo=scanner.nextDouble();
		        kisi.setKilo(kilo);
		        
		        System.out.print("Boyunuzu cm cinsinden giriniz: ");
		        double boy=scanner.nextDouble();
		        kisi.setBoy(boy);
		        System.out.println("-------------------------------------------------------------");
		        System.out.println("Merhaba, " + kisi.getKullaniciad() + " :)");
		        
		        kisi.idealKiloHesapla(kilo,boy);
		        System.out.println("-------------------------------------------------------------");
		        int hesaplananKalori = KaloriHesaplayici.hesaplaKalori(cinsiyet, yas);
		        System.out.println("Günlük İhtiyacınız Olan Kalori: " + hesaplananKalori + " kcal");
		        System.out.println("-------------------------------------------------------------");

		        int secim;
		        do {
		        	
		        System.out.print("Diyet seçiniz(1:Vegan ,2:Vejeteryan ,3:Glutensiz ,4:Paleo ,5:Ketojenik): ");
		      
		       secim=scanner.nextInt();
		        System.out.println("-------------------------------------------------------------");
		        Besin seciliDiyet ;
		        
		        switch (secim) {
		        case 1:
		            seciliDiyet = new VeganDiyet();
		            seciliDiyet.diyetBilgisi();
		            System.out.println("-------------------------------------------------------------");
		            seciliDiyet.ornekMenuEkle();
		           break;
		        case 2:
		            seciliDiyet = new VejeteryanDiyeti();
		            seciliDiyet.diyetBilgisi();
		            System.out.println("-------------------------------------------------------------");
		            seciliDiyet.ornekMenuEkle();
		            break;
		        case 3:
		            seciliDiyet = new GlutensizDiyet();
		            seciliDiyet.diyetBilgisi();
		            System.out.println("-------------------------------------------------------------");
		            seciliDiyet.ornekMenuEkle();
		            break;
		        case 4:
		        	seciliDiyet= new PaleoDiyet();
		        	seciliDiyet.diyetBilgisi();
		        	 System.out.println("-------------------------------------------------------------");
		        	seciliDiyet.ornekMenuEkle();
		        	break;
		        	
		        case 5:
		        	seciliDiyet= new KetojenikDiyet();
		        	seciliDiyet.diyetBilgisi();
		        	 System.out.println("-------------------------------------------------------------");
		        	seciliDiyet.ornekMenuEkle();
		        	break;
		        default:
		            System.out.println("Geçersiz seçim.");
		          break;
		    }
		    	
		}
		        while (secim < 1 || secim > 5);
		        
		        System.out.println("-----------------------------------------------------------------------");
			       System.out.println("Diyet programımızın yanında egzersiz programımız da var");
			       System.out.println("-----------------------------------------------------------------------");
			       
			       Diyet.Egzersiz egzersiz = kisi.new Egzersiz(); // Egzersiz sınıfından bir nesne oluşturuyoruz
			       
			       egzersiz.egzersizTurleri();
			       System.out.println("-----------------------------------------------------------------------");
			    
			       egzersiz.egsersizSec(secim);
			       System.out.println("-----------------------------------------------------------------------");
			       
			       egzersiz.egzersizYap(egzersiz.egzersiAdi, egzersiz.sureDakika);
			       System.out.println("-----------------------------------------------------------------------");
			       
			       egzersiz.basla();
			       
			       System.out.println("-----------------------------------------------------------------------");
			       egzersiz.egzersizYap(egzersiz.egzersiAdi, egzersiz.sureDakika, egzersiz.tekrarSayisi);
			       System.out.println("-----------------------------------------------------------------------");
			       System.out.println("");
			       
			       System.out.println("Bu egzersiz programızın yanında su içmeyi de ihmal etmeyelim !!!");
			       System.out.println("-----------------------------------------------------------------------");
		          kisi.hesaplaSuIcmeHedefi();
		          kisi.suIcmeTakibi();
	}

}
 