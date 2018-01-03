public class Asker extends insan {
	private int silah;
	public Asker(int s,int sil) {
		super(s);
		silah=sil;
	}
	
	public int GucHesapla() {
		return getSavunma()*silah;
	}
	
	public int getSilah() {return silah;}
	public void setSilah(int silah) {this.silah = silah;}
}