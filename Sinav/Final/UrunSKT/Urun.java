public class Urun {
	private Zaman skt;
	private String ad,tip;
	
	public Urun(String a,String t,Zaman s) {
		ad=a;
		tip=t;
		skt=s;
	}Urun() {}

	public String toString() {
		return ad + " Urun Tipi : " + tip + " SKT : " + skt.getAy() + " " + skt.getYil();
	}
	
	public Zaman getSkt()		  {return skt;}
	public void setSkt(Zaman skt) {this.skt = skt;}
	public String getAd() 		  {return ad;}
	public void setAd(String ad)  {this.ad = ad;}
}