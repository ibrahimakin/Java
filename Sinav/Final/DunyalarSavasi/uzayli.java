public abstract class uzayli {
	private int savunma;
	public uzayli(int s) {
		savunma=s;
	}
	
	public int GucHesapla() {
		return savunma;
	}
	
	public int getSavunma() {return savunma;}
	public void setSavunma(int savunma) {this.savunma = savunma;}
}