public class Cyborg extends uzayli {
	private int laser;
	public Cyborg(int s,int l) {
		super(s);
		laser=l;
	}
	
	public int GucHesapla() {
		return getSavunma()*laser;
	}
	
	public int getLaser() {return laser;}
	public void setLaser(int laser) {this.laser = laser;}
}