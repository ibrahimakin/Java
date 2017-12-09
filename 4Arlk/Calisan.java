public class Calisan {
	private String ad,soyad;
	private int id;
	 int sa_uc,ca_sa;
	public Calisan(String a, String s, int i, int su,int cs) {
		ad=a; soyad=s; id=i; sa_uc=su; ca_sa=cs;
	}
	public String getAd() {
		return ad;
	}
//	public void setAd(String ad) {
//		this.ad = ad;
//	}
	public String getSoyad() {
		return soyad;
	}
//	public void setSoyad(String soyad) {
//		this.soyad = soyad;
//	}
	public int Kazanc() {
		return ca_sa*sa_uc;
	}
}