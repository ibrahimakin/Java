public class Madenci extends uzayli {
	private int urun;
	public Madenci(int s,int u) {
		super(s);
		urun=u;
	}
	
	public int GucHesapla() {
		return getSavunma();
	}
	
	public int getUrun() {return urun;}
	public void setUrun(int urun) {this.urun = urun;}
}