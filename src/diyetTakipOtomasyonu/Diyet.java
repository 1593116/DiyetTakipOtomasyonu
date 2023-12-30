package diyetTakipOtomasyonu;

import java.util.Scanner;

public class Diyet {
	
	private String kullaniciad;
	private int yas;
	private String cinsiyet;
	private double kilo;
	private double boy;
	double idealKilo;
	Scanner scanner=new Scanner(System.in);

	public String getKullaniciad() {
		return kullaniciad;
	}
	public void setKullaniciad(String kullaniciad) {
		this.kullaniciad = kullaniciad;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public String getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	public double getKilo() {
		return kilo;
	}
	public void setKilo(double kilo) {
		this.kilo = kilo;
	}
	public double getBoy() {
		return boy;
	}
	public void setBoy(double boy) {
		this.boy = boy;
	}
	//overloading örneği
	public Diyet( String kullanciad,int yas, double kilo, double boy)
	{
		this.kullaniciad=kullanciad;
		this.yas=yas;
		
		this.kilo=kilo;
		this.boy=boy;
	}
	public Diyet(String cinsiyet) {
		this.cinsiyet=cinsiyet;
	}

		

    public Diyet(){
      
    }
	public void idealKiloHesapla(double kilo, double boy) {
	
		if(cinsiyet=="e" || cinsiyet=="E")
		{
			idealKilo=50+2.3*((boy/2.54)-60);
		}
		else {
			idealKilo=45.5+2.3*((boy/2.54)-60);
		}
		
	System.out.println("ideal kilonuz:"+idealKilo);
	if(kilo>idealKilo)
	{
		Double verilecekKilo=kilo-idealKilo;
		System.out.println("Zayıflamalısınız , verilecek kilo miktarı:"+verilecekKilo);
		hedefler();
		
		
   }  
	else {
		Double alinacakKilo=idealKilo-kilo;
		System.out.println("Kilo almalısınız, alınacak kilo miktarı:"+alinacakKilo);
		hedefler();
		
	}
	}
    public void hedefler() {
		
		System.out.println("Hedef kilonuza ulaşmak için aşağıdaki diyet programını uygulayabilirsiniz: ");
		System.out.println("1. Düzenli egzersiz yapın.");
        System.out.println("2. Sağlıklı beslenme alışkanlıkları geliştirin.");
        
	}
    public class Egzersiz {
    	public String egzersiAdi;
    	public int sureDakika;
    	public int tekrarSayisi;
    	
    
	
    	
        // Egzersiz sınıfının içindeki metotlar...
    	public void egzersizTurleri() {
    		System.out.println("*EGZERSİZ*");
            System.out.println("1. Koşu");
            System.out.println("2. Bisiklet");
            System.out.println("3. Yüzme");
            System.out.println("4. Kardiyo");
            System.out.println("5. İp Atlama");
            System.out.println("6. Squat");
            System.out.println("7. Jumping");
        }
    	
    	public void kosuBilgi() {
    	
    		System.out.println("*** Koşu egzersizi seçildi ***");
    		System.out.println("# Koşu, kalori yakımını artırarak kilo kaybına katkıda bulunabilir. Bu, enerji harcamasını artırarak vücut yağının azaltılmasına yardımcı olabilir.");
			System.out.println("# Düzenli koşu, metabolizma hızını artırabilir. Bu, vücudun daha etkili bir şekilde enerji harcamasına ve kilo kontrolünü desteklemeye yardımcı olabilir.");
		    System.out.println("# Koşu, kalp sağlığını artırabilir. Düzenli kardiyovasküler egzersiz, kan dolaşımını iyileştirir, kalp kasını güçlendirir ve kardiyovasküler hastalık riskini azaltabilir.");
		    System.out.println("# Koşu, özellikle alt vücut kaslarını güçlendirebilir ve tonusunu artırabilir. Bu, vücut kompozisyonunu iyileştirerek daha sıkı bir görünüme katkıda bulunabilir.");
    		
    	}
    	public void bisikletBilgi() {
    		
    		System.out.println("*** Bisiklet sürme egzersizi seçildi ***");
    		System.out.println("# Bisiklet sürmek, vücutta kalori yakımını artırabilir. Bisiklet sürmek, özellikle aerobik egzersiz olduğu için, vücut enerji üretmek için yağları kullanabilir. Bu da kilo kaybına yardımcı olabilir. ");
    		System.out.println("# Bisiklet sürmek, kalp sağlığını artırabilir. Düzenli olarak yapılan aerobik egzersiz, kalp-damar sistemini güçlendirir, kan dolaşımını artırır ve kardiyovasküler hastalıkların riskini azaltabilir.");
    		System.out.println("# Bisiklet sürmek, metabolizma hızını artırarak daha fazla kalori yakılmasına yardımcı olabilir. Egzersiz sonrası vücut, enerjiyi geri kazanmak ve dokuları onarmak için daha fazla çaba sarf eder.");
    		System.out.println("# Bisiklet sürmek, özellikle bacak kaslarını güçlendirebilir. Kas kütlesi arttıkça, vücut daha fazla enerji harcar.");
    	}
    	public void yuzmeBilgi() {
    		
    		System.out.println("*** Yüzme egzersizi seçildi ***");
    		System.out.println("# Yüzme, vücutta geniş bir kas yelpazesi kullanarak kalori yakımını artırabilir. Bu, kilo kaybını destekleyebilir.");
    		System.out.println("# Yüzme, genel vücut dayanıklılığını artırabilir ve kas kuvvetini geliştirebilir. Farklı yüzme stilleri farklı kas gruplarını çalıştırır.");
    		System.out.println("# Yüzme, vücut esnekliğini artırabilir. Su içinde yapılan hareketler, eklem hareketliliğini ve genel esnekliği artırabilir.");
    		
    	}
        public void kardiyoBilgi() {
        	
        	System.out.println("*** Kardiyo egzersizi seçildi ***");
        	System.out.println("");
        	System.out.println("# Düzenli kardiyo egzersizleri, metabolizma hızını artırabilir. Bu, dinlenme halinde daha fazla kalori yakılmasına ve kilo kontrolünün desteklenmesine yardımcı olabilir.");
    		System.out.println("# Bazı kardiyo aktiviteleri, özellikle dirençle birleştirildiğinde, kas tonu ve gücünü artırabilir.");
    		System.out.println("# Düzenli kardiyo, uyku kalitesini artırabilir. Kaliteli bir uyku, genel sağlık ve kilo kontrolü için önemlidir.");
    		System.out.println("# Kardiyo egzersizleri, insülin hassasiyetini artırarak kan şekerinin kontrol altında tutulmasına yardımcı olabilir. Bu, tip 2 diyabet riskini azaltabilir.");
    	}
        public void ipAtlamaBilgi() {
        
        	System.out.println("*** İp Atlama egzersizi seçildi ***");
        	System.out.println("# İp atlama, vücuttaki birçok kası çalıştırır ve enerji harcamasını artırır. Bu, kilo kaybını destekleyen kalori yakımını artırabilir.");
    		System.out.println("# İp atlama, kardiyo-vascular sistem üzerinde olumlu etkiler yapar. Kalp atış hızını artırarak, kan dolaşımını iyileştirir ve genel kardiyovasküler sağlığı güçlendirir.");
    		System.out.println("# İp atlama, ayak ve bacak kaslarınızı çalıştırırken aynı zamanda kol ve omuz kaslarını da kullanmanızı sağlar. Bu, dolaşımı artırarak dokulara daha fazla oksijen ve besin sağlar.");
    		System.out.println("# İp atlama, özellikle bacak, kalça ve karın kasları olmak üzere birçok kas grubunu hedef alır. Düzenli olarak yapıldığında, kas kuvvetini artırabilir ve vücudu sıkılaştırabilir.");
    	}
        public void squatBilgi() {
        	
        	System.out.println("*** Squat yapma egzersizi seçildi ***");
    		System.out.println("# Squat, vücut ağırlığına dayalı bir direnç egzersizidir. Bu egzersiz, büyük kas gruplarını çalıştırarak kalori yakımını artırır. Diyet sürecinde ekstra kalori yakmak, kilo kaybını destekleyebilir.");
    		System.out.println("# Squat, özellikle bacak kaslarını çalıştırır ve bu bölgelerde kas tonunu artırır. Aynı zamanda bel, kalça ve alt sırt kaslarını da hedef alarak genel vücut gücünü artırabilir.");
    		System.out.println("# Squat gibi büyük kas gruplarını çalıştıran egzersizler, metabolizma hızını artırabilir. Daha fazla kas kütlesi, vücut daha fazla enerji harcamak zorunda olduğu için metabolizma hızını artırabilir.");
    		System.out.println("# Doğru şekilde yapılan squat egzersizleri, bel, sırt ve bacak kaslarını güçlendirerek postürü iyileştirebilir. Doğru duruş, vücudun daha fazla kalori yakmasına ve genel sağlığı artırmaya yardımcı olabilir.");
    		System.out.println("# Diyet yaparken, kas kaybını önlemek önemlidir. Squat gibi direnç egzersizleri, kas kitlesini korumaya yardımcı olabilir. Kas kütlesi korunduğu sürece, vücut daha fazla kalori yakabilir.");
    	}
        public void jumpingBilgi() {
        	
        	System.out.println("*** Jumping yapma egzersizi seçildi ***");
    		System.out.println("# Jumping egzersizleri, vücuttaki birçok kas grubunu çalıştırarak enerji harcamasını artırabilir. Bu, kilo kaybını destekleyen kalori yakımını artırabilir. ");
    		System.out.println("# Jumping, kalp atış hızını artırarak kardiyo-vascular sistem üzerinde olumlu etkiler yapabilir. Düzenli olarak yapıldığında, kalp sağlığını güçlendirebilir ve genel dayanıklılığı artırabilir.");
    		System.out.println("# Jumping egzersizleri, bacak, kalça, karın ve alt sırt kasları gibi birçok kas grubunu hedef alır. Bu, vücutta kas kuvvetini artırabilir ve tonlanmayı destekleyebilir.");
    		System.out.println("# Egzersiz, endorfin salgılanmasını tetikleyerek stresi azaltabilir ve ruh halini iyileştirebilir. Jumping gibi enerji harcayan egzersizler, genellikle enerjiyi yükseltir ve pozitif bir mental durum sağlar.");
    		System.out.println("# Jumping egzersizleri, esnekliği artırabilir ve vücuttaki çeşitli eklem hareket açıklıklarını destekleyebilir.");
    	}
    	
    	
        public void egsersizSec(int secim) {
    		// tekrar secim için döngü
    		do {
    			System.out.print("Egzersiz türü seçin: ");
     	        secim=scanner.nextInt();
     	        System.out.println("-----------------------------------------------------------------------");
        		switch (secim) {
    			case 1: 
    				kosuBilgi();
    				egzersiAdi="Koşu ";
    				sureDakika=30;
    				tekrarSayisi=7;
    				
    				break;
    			case 2:
    				bisikletBilgi();
    				egzersiAdi="Bisiklet sürme";
    				sureDakika=45;
    				tekrarSayisi=3;
    				break;
    			case 3:
    		        yuzmeBilgi();
    		        egzersiAdi="Yüzme";
    				sureDakika=50;
    				tekrarSayisi=3;
    				break;
    			case 4: 
    				kardiyoBilgi();
    				egzersiAdi="Kardiyo ";
    				sureDakika=20;
    				tekrarSayisi=6;
    				break;
    			case 5:
    				ipAtlamaBilgi();
    				egzersiAdi="İp Atlama";
    				sureDakika=20;
    				tekrarSayisi=5;
    				break;
    			case 6:
    				squatBilgi();
    				egzersiAdi="Squat";
    				sureDakika=20;
    				tekrarSayisi=7;
    				break;
    			case 7:
    				jumpingBilgi();
    				egzersiAdi="Jumping";
    				sureDakika=10;
    				tekrarSayisi=7;
    				break;
    			default:
    				System.out.println("geçersiz seçim");
    			}
				
			} while (secim < 1 || secim > 7);
    		
			
		}
    	
    		
    	

        // içiçe class olarak oluşturduğumuz egzersiz sınıfına ait overloading örneği
    	
    	public void egzersizYap(String egzersizAdi, int sureDakika) {
            System.out.println(egzersizAdi+" egzersizi "+" için tavsiye edilen günlük süre: "+sureDakika+ " dakikadır.");
            
        }
    	public void basla() {
        	System.out.println("Haydi başlayalım :)");
			
		}
       
        public void egzersizYap(String egzersizAdi, int sureDakika, int tekrarSayisi) {
            System.out.println(egzersizAdi+" "+sureDakika + " dakika sürecek, bu egzersizi haftada "+ tekrarSayisi +" kez tekrar edebilirsiniz :)" );
        }
     }
    
    
    
    public int  icilenSuMiktari;
    public int suIcmeHedefi; 
    
    public void hesaplaSuIcmeHedefi() {
    	
        suIcmeHedefi = (int) (kilo * 33); 

        System.out.println("Günlük İçilmesi Gereken Su Miktarı: " + suIcmeHedefi + " ml");

        
        }
    public void suIcmeTakibi() {
        boolean gecerliGiris = false;

        while (!gecerliGiris) {
            try {
                System.out.print("Bugün içtiğiniz su miktarını ml cinsinden giriniz: ");
                int icilenSuMiktari = scanner.nextInt();
                
                suIcmeTakibi(icilenSuMiktari);
                gecerliGiris = true; // Geçerli giriş yapıldığında döngüden çık
            } catch (Exception e) {
                System.out.println("Hata: Geçerli bir sayı girilmedi. Tekrar deneyin.");
                scanner.next(); // Hatalı girişi temizle
            }
        }
    }

    public void suIcmeTakibi(int icilenSuMiktari) {
    	hesaplaSuIcmeHedefi();
    	
        double kalanSuHedefi = suIcmeHedefi -   icilenSuMiktari;

                if (kalanSuHedefi > 0) {
                    System.out.println("Bugün içtiğiniz su miktarı yeterli değil. Gün içinde " + kalanSuHedefi + " ml daha su içmelisiniz.");
                } else {
                    System.out.println("Tebrikler! Bugün içilen su miktarı günlük hedefinizi karşılamıştır.");
                }

	}
  
}
    

