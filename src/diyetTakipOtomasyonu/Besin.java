package diyetTakipOtomasyonu;

public abstract class Besin {
	
    private String ad;
    public Besin(String ad) {
        this.ad = ad;
    }
	abstract void diyetBilgisi();
	 public String getAd() {
		 return "ad";
	 }
	abstract void ornekMenuEkle();
	public void setAd(String ad) {
	}

}
