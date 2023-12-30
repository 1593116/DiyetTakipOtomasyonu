package diyetTakipOtomasyonu;

import java.awt.datatransfer.SystemFlavorMap;

public class KaloriHesaplayici {
	public static int hesaplaKalori(String cinsiyet,int yas) {
		try {
			if(yas <19) {
				throw new IllegalArgumentException("Üzgünüz yaşınız 19'dan küçük olduğundan size uygun bir diyet listesi sunamıyoruz :(");
			}
			switch (cinsiyet.toLowerCase()) {
          case "k":
              if (yas >= 19 && yas <= 30) {
                  return 2000;
              } else if (yas >= 31 && yas <= 50) {
                  return 1800;
              } else if (yas >= 51) {
                 return 1600;
              } else {
                   return 0;
              }
          case "e":
              if (yas >= 19 && yas <= 30) {
                  return 2400;
              } else if (yas >= 31 && yas <= 50) {
                  return 2200;
              } else if (yas >= 51) {
                  return 2000;
              } else {
                  return 0;
              }
              default:
                  return 0;
          }
			
		}
		catch(IllegalArgumentException e) {
			System.out.println("Hata:"+ e.getMessage());
			System.exit(0);
		
		}
		return 0;
      }
  } 