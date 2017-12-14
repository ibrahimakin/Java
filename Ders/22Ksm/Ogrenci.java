
public class Ogrenci {
	public String Ad;
	public int Yas;

	public Ogrenci() {}
	public Ogrenci(String Ad,int Yas) {
		this.Ad=Ad;
		this.Yas=Yas;
	}
	
	public String getAd() {
		return Ad;
	}
	public void setAd(String ad) {
		Ad = ad;
	}
	public int getYas() {
		return Yas;
	}
	public void setYas(int yas) {
		Yas = yas;
	}
}
