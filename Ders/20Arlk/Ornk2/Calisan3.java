
public abstract class Calisan3 implements IGiderler {

	private String ad, sskNo;
	public Calisan3(String a,String s) {
		ad=a; sskNo=s;
	}
	
	public String toString() {					// java Object classýndan override.
		return "Calisan : "+getAd();
	}

//	@Override
//	public double odemeHesap() {
//		return 0;
//	}
	
	public String getAd() {return ad;}

	public void setAd(String ad) {this.ad = ad;}

	public String getSskNo() {return sskNo;}

	public void setSskNo(String sskNo) {this.sskNo = sskNo;}
}