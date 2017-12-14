
public class isci {
	private String Ad;
	private String Soyad;
	private int CalismaSaati;
	private int SaatlikUcret;
//	void isci(String Ad, String Soyad,int cs, int su) {
//	}
	public String getAd() {
		return Ad;
	}
	public void setAd(String a) {
		this.Ad=a;
	}
	public String getSoyad() {
		return Soyad;
	}
	void setSoyad(String s) {
		this.Soyad=s;
	}
	int getCa() {
		return CalismaSaati;
	}
	void setCa(int ca) {
		CalismaSaati=ca;
	}
	int getSu() {
		return SaatlikUcret;
	}
	void setSu(int su) {
		SaatlikUcret=su;
	}
}